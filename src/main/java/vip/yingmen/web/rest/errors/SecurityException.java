package vip.yingmen.web.rest.errors;

@SuppressWarnings("serial")
public class SecurityException extends RuntimeException {
	public final String msg;
	public SecurityException(String msg) {
		this.msg = msg;
	}

	public static SecurityException getInstance(String msg) {
		return new SecurityException(msg);
	}
}
