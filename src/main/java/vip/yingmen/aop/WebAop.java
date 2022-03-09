package vip.yingmen.aop;

import java.lang.reflect.Method;
import java.time.Instant;

import org.apache.commons.lang3.StringUtils;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import vip.yingmen.domain.WebUser;
import vip.yingmen.domain.WebUserULog;
import vip.yingmen.repository.WebUserRepository;
import vip.yingmen.repository.WebUserULogRepository;
import vip.yingmen.security.AuthoritiesConstants;
import vip.yingmen.security.SecurityUtils;
import vip.yingmen.tool.WebTool;
import vip.yingmen.web.rest.errors.ReqErrorException;
import vip.yingmen.web.rest.errors.SecurityException;


@Aspect
@Service
@Order(1) //order越小越是最先执行
public class WebAop {
	 
		 
		 @Pointcut("execution(org.springframework.http.ResponseEntity vip.yingmen.web.rest.*WebApi.*(..) )")
		    public void webReq() {
		    }
		 
		 @Around("webReq()") 
		 public Object  webReqAround(ProceedingJoinPoint joinpoint) throws Throwable{
		 	 if (!SecurityUtils.isCurrentUserInRole(AuthoritiesConstants.ADMIN)) {
		 		 throw SecurityException.getInstance("请登录");
		 	 }
		 	Object res =  joinpoint.proceed();
		 	
		 	setLog(joinpoint);
		 	
		 	return res;
		 }
		 
		    //声明前置通知  
//		    @Before("webReq()")  
//		    public void doBefore(JoinPoint point) {  
//			 	 if (!SecurityUtils.isCurrentUserInRole(AuthoritiesConstants.ADMIN)) {
//			 		 throw SecurityException.getInstance("请传正确 jwt token");
//			 	 }
//		    }  
		 
			@Autowired
			 private  WebUserRepository userRepository;
			@Autowired
			 private  WebUserULogRepository webUserULogRepository;
			@Autowired
			 private  WebTool webTool;
		 public void setLog(ProceedingJoinPoint joinpoint) {
//				if (SecurityUtils.isCurrentUserInRole(AuthoritiesConstants.App_ADMIN)) {
					String login = SecurityUtils.getCurrentUserLogin().orElse("no-logib");
					WebUser user  = this.userRepository.queryByLogin(login)
			    			.orElseThrow(()->ReqErrorException.getInstance("账号错误"));
					Api api =  joinpoint.getTarget().getClass().getAnnotation(Api.class);
					if (api == null) {
						return ;
					}
					String apiTag = api.tags()[0];
					String action="";
					
					 MethodSignature  signature = (MethodSignature) joinpoint.getSignature();
					 Method method =  signature.getMethod();
					 if (method.isAnnotationPresent(PostMapping.class) ) {
						 action = "新增";
					 }
					 if ( method.isAnnotationPresent(PutMapping.class)) {
						 action = "修改";
					 }
					 if (method.isAnnotationPresent(GetMapping.class)) {
//						 action = "查询";
						 return ; // 查询不用记录
					 }	
					 if (method.isAnnotationPresent(DeleteMapping.class)) {
						 action = "删除";
					 }	
					 if (StringUtils.isBlank(action)) {
						 return ; // 查询不用记录
					 }
					 
						String apiOperationStr="";
						ApiOperation apiOperation =  joinpoint.getTarget().getClass().getAnnotation(ApiOperation.class);
						if (apiOperation != null) {
							apiOperationStr = apiOperation.value();
						 }
					 
					 String content = apiTag+"-"+action;
					 if (StringUtils.isNotBlank(apiOperationStr)) {
						 content = apiTag +"-"+apiOperationStr;
					 }else {
						 content = apiTag+"-"+action;
					 }
					 WebUserULog webUserULog  = new WebUserULog()
							 .browser(webTool.getBrowser())
							 .content(content )
							 .type(action)
							 .loginIp(webTool.getIp())
							 .time(Instant.now())
							 .webUser(user)
							 ;
					 webUserULogRepository.save(webUserULog);


			 }
}
