package vip.yingmen.web.rest;

import java.time.Instant;
import java.util.Optional;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.base.Objects;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import vip.yingmen.domain.OnlineWebUser;
import vip.yingmen.domain.WebUser;
import vip.yingmen.domain.WebUserULog;
import vip.yingmen.domain.enumeration.WebUserStatus;
import vip.yingmen.repository.OnlineWebUserRepository;
import vip.yingmen.repository.WebUserRepository;
import vip.yingmen.repository.WebUserULogRepository;
import vip.yingmen.security.AuthoritiesConstants;
import vip.yingmen.security.SecurityUtils;
import vip.yingmen.security.jwt.JWTFilter;
import vip.yingmen.security.jwt.TokenProvider;
import vip.yingmen.template.Constants;
import vip.yingmen.tool.WebTool;
import vip.yingmen.vo.WebUserVo;
import vip.yingmen.web.rest.errors.ReqErrorException;
import vip.yingmen.web.rest.vm.LoginVM;

/**
 * Controller to authenticate users.
 */
@RestController
@RequestMapping("/guanqu")
@Api(tags = "jwt")
public class UserJWTController {

//    private final TokenProvider tokenProvider;

//    private final AuthenticationManagerBuilder authenticationManagerBuilder;

//    public UserJWTController(TokenProvider tokenProvider, AuthenticationManagerBuilder authenticationManagerBuilder) {
//        this.tokenProvider = tokenProvider;
//        this.authenticationManagerBuilder = authenticationManagerBuilder;
//    }

	@Autowired
	 private  WebUserRepository userRepository;
	@Autowired
	 private  TokenProvider tokenProvider;
	@Autowired
	 private  WebUserULogRepository webUserULogRepository;
	@Autowired
	 private  OnlineWebUserRepository onlineWebUserRepository;
	@Autowired
	 private  WebTool webTool;
    @PostMapping("/ext-web/authenticate")
    @ApiOperation(value = "??????",notes = "??????jwt token")
    @Transactional
    public ResponseEntity<JWTToken> authorize(@Valid @RequestBody LoginVM loginVM,HttpServletResponse response) {

    	WebUser user  = this.userRepository.queryByLogin(loginVM.getUsername())
    			.orElseThrow(()->ReqErrorException.getInstance("????????????"));
    	if (!Objects.equal(user.getPasswd(), loginVM.getPassword())) {
			throw ReqErrorException.getInstance("????????????");
		}
    	if (Objects.equal(user.getStatus(), WebUserStatus.FREEZE)) {
			throw ReqErrorException.getInstance("???????????????");
		}
        String jwt = tokenProvider.createToken(user.getLogin(),AuthoritiesConstants.ADMIN);
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add(JWTFilter.AUTHORIZATION_HEADER, "Bearer " + jwt);
        Cookie cookie= new Cookie(JWTFilter.AUTHORIZATION_HEADER,jwt);
        cookie.setMaxAge(Integer.MAX_VALUE);
        cookie.setPath("/guanqu/web");
	    response.addCookie(cookie);
        
        String browser = webTool.getBrowser();
        String loginIp = webTool.getIp();
		 WebUserULog webUserULog  = new WebUserULog()
				 .browser(browser)
				 .content("??????" )
				 .type("??????")
				 .loginIp(loginIp)
				 .time(Instant.now())
				 .webUser(user)
				 ;
		 webUserULogRepository.save(webUserULog);
		 Optional<OnlineWebUser> onlineWebUser = this.onlineWebUserRepository.findByWebUserAndLoginIp(user, loginIp);
		 if (onlineWebUser.isPresent()) {
			 onlineWebUser.get().loginTime(Instant.now()).delFlag(Constants.noDel);
			 this.onlineWebUserRepository.save(onlineWebUser.get());
		 }else {
			 OnlineWebUser  onlineWebUserNew = new OnlineWebUser()
					 .browser(browser)
					 .loginIp(loginIp)
					 .loginTime(Instant.now())
					 .webUser(user)
					 .delFlag(Constants.noDel)
					 ;
			 this.onlineWebUserRepository.save(onlineWebUserNew);
		 }
		 
		 
        return new ResponseEntity<>(new JWTToken(jwt,user), httpHeaders, HttpStatus.OK);
    }

    

    @DeleteMapping("/web/user/logout")
    @ApiOperation(value = "????????????",notes = "")
    @Transactional
    public ResponseEntity<Void> logout(HttpServletResponse response) {

    	String login = SecurityUtils.getCurrentUserLogin()
    			.orElseThrow(()->ReqErrorException.getInstance("?????????"));
		WebUser user  = this.userRepository.queryByLogin(login)
    			.orElseThrow(()->ReqErrorException.getInstance("????????????"));
	      String loginIp = webTool.getIp();
        
		 Optional<OnlineWebUser> onlineWebUser = this.onlineWebUserRepository.findByWebUserAndLoginIp(user, loginIp);
		 if (onlineWebUser.isPresent()) {
			 onlineWebUser.get().delFlag(Constants.isDel);
			 this.onlineWebUserRepository.save(onlineWebUser.get());
		 }
		    Cookie cookie= new Cookie(JWTFilter.AUTHORIZATION_HEADER,"logout-token");
	        cookie.setMaxAge(0);
	        cookie.setPath("/guanqu/web");
		    response.addCookie(cookie);
		 
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
    /**
     * Object to return as body in JWT Authentication.
     */
    static class JWTToken {

    	public String idToken;
        public  WebUserVo webUser;

        JWTToken(String idToken,WebUser webUser) {
            this.idToken = idToken;
            this.webUser = WebUserVo.getInstance(webUser);
        }

    }
}
