package vip.yingmen.web.rest.errors;

@SuppressWarnings("serial")
public class ReqErrorException extends RuntimeException {
	public final String msg;
	public ReqErrorException(String msg) {
		this.msg = msg;
	}

	public static ReqErrorException getInstance(String msg) {
		return new ReqErrorException(msg);
	}
}
