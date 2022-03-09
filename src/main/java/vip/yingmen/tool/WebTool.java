package vip.yingmen.tool;

import java.net.InetAddress;
import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@Service
public class WebTool {

	public String getBrowser() {
		HttpServletRequest request = getRequest();
		
		 Enumeration<String> headerNames = request.getHeaderNames();
	        String allInfo = "";
	        while (headerNames.hasMoreElements()){
	 
	            String header = headerNames.nextElement();
	            allInfo += header + ": ";
	            allInfo += request.getHeader(header) + "\n";
	        }
	        String osAndBrower = request.getHeader("user-agent");

		
		return osAndBrower;
	}

	public String getIp() {
		    HttpServletRequest request = getRequest();
		   return getIp(request);
	}

	private HttpServletRequest getRequest() {
		ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes)RequestContextHolder.getRequestAttributes();
		HttpServletRequest request = servletRequestAttributes.getRequest();
		return request;
	}
	
	
	private String getIp(HttpServletRequest request) {

	    String ipAddress = null;
	    Enumeration<String> headerNames = request.getHeaderNames();
	    while (headerNames.hasMoreElements()) {
	        String s = headerNames.nextElement();
	        String header = request.getHeader(s);
	        System.err.print(s+"=");
	        System.err.println(header);
	    }
	    ipAddress = request.getHeader("x-forwarded-for");
	    if (ipAddress == null || ipAddress.length() == 0 || "unknown".equalsIgnoreCase(ipAddress)) {
	        ipAddress = request.getHeader("Proxy-Client-IP");
	    }
	    if (ipAddress == null || ipAddress.length() == 0 || "unknown".equalsIgnoreCase(ipAddress)) {
	        //X-Real-IP：nginx服务代理
	        ipAddress = request.getHeader("X-Real-IP");
	    }
	    if (ipAddress == null || ipAddress.length() == 0 || "unknown".equalsIgnoreCase(ipAddress)) {
	        ipAddress = request.getHeader("WL-Proxy-Client-IP");
	    }
	    if (ipAddress == null || ipAddress.length() == 0 || "unknown".equalsIgnoreCase(ipAddress)) {

	        ipAddress = request.getHeader("HTTP_CLIENT_IP");
	    }
	    if (ipAddress == null || ipAddress.length() == 0 || "unknown".equalsIgnoreCase(ipAddress)) {

	        ipAddress = request.getHeader("HTTP_X_FORWARDED_FOR");
	    }
	    if (ipAddress == null || ipAddress.length() == 0 || "unknown".equalsIgnoreCase(ipAddress)) {
	        ipAddress = request.getRemoteAddr();
	        if (ipAddress.equals("127.0.0.1") || ipAddress.equals("0:0:0:0:0:0:0:1")) {
	            // 根据网卡取本机配置的IP
	            InetAddress inet = null;
	            try {
	                inet = InetAddress.getLocalHost();
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
	            ipAddress = inet.getHostAddress();
	        }

	    }

	    // 对于通过多个代理的情况，第一个IP为客户端真实IP,多个IP按照','分割
	    if (ipAddress != null && ipAddress.length() > 15) { // "***.***.***.***".length()
	        // = 15
	        if (ipAddress.indexOf(",") > 0) {
	            ipAddress = ipAddress.substring(0, ipAddress.indexOf(","));
	        }
	    }
	    return ipAddress;
	}

}
