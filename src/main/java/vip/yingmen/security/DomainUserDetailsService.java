package vip.yingmen.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.google.common.base.Objects;
import com.google.common.collect.Lists;

import vip.yingmen.domain.WebUser;
import vip.yingmen.domain.enumeration.WebUserStatus;
import vip.yingmen.repository.WebUserRepository;
import vip.yingmen.template.Constants;
import vip.yingmen.web.rest.errors.ReqErrorException;

/**
 * Authenticate a user from the database.
 */
@Component("userDetailsService")
public class DomainUserDetailsService implements UserDetailsService {

//    private final Logger log = LoggerFactory.getLogger(DomainUserDetailsService.class);
//
//    private final UserRepository userRepository;
//
//    public DomainUserDetailsService(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }
	@Autowired
	 private  WebUserRepository userRepository;
    @Override
    @Transactional
    public UserDetails loadUserByUsername(final String login) {
//        log.debug("Authenticating {}", login);
//        if (new EmailValidator().isValid(login, null)) {
//            return userRepository.findOneWithAuthoritiesByEmailIgnoreCase(login)
//                .map(user -> createSpringSecurityUser(login, user))
//                .orElseThrow(() -> new UsernameNotFoundException("User with email " + login + " was not found in the database"));
//        }
//
//        String lowercaseLogin = login.toLowerCase(Locale.ENGLISH);
//        return userRepository.findOneWithAuthoritiesByLogin(lowercaseLogin)
//            .map(user -> createSpringSecurityUser(lowercaseLogin, user))
//            .orElseThrow(() -> new UsernameNotFoundException("User " + lowercaseLogin + " was not found in the database"));
    	
    	WebUser user  = this.userRepository.queryByLogin(login).orElseThrow(()->ReqErrorException.getInstance("账号错误"));
    	if (Objects.equal(user.getStatus(), WebUserStatus.FREEZE)) {
			throw ReqErrorException.getInstance("账号已冻结");
		}
    	return createSpringSecurityUser(login,user);
    }
//
//    private org.springframework.security.core.userdetails.User createSpringSecurityUser(String lowercaseLogin, User user) {
//        if (!user.getActivated()) {
//            throw new UserNotActivatedException("User " + lowercaseLogin + " was not activated");
//        }
//        List<GrantedAuthority> grantedAuthorities = user.getAuthorities().stream()
//            .map(authority -> new SimpleGrantedAuthority(authority.getName()))
//            .collect(Collectors.toList());
//        return new org.springframework.security.core.userdetails.User(user.getLogin(),
//            user.getPassword(),
//            grantedAuthorities);
//    }
    
  private org.springframework.security.core.userdetails.User createSpringSecurityUser(String login, WebUser user) {
	  return new org.springframework.security.core.userdetails.User(user.getLogin(),
	      user.getPasswd(),
	      Lists.newArrayList(new SimpleGrantedAuthority(AuthoritiesConstants.ADMIN)));
  }
}
