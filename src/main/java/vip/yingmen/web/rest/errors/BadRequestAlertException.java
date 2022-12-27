package vip.yingmen.web.rest.errors;

import org.zalando.problem.AbstractThrowableProblem;
import org.zalando.problem.Status;

@SuppressWarnings("serial")
@Deprecated
public class BadRequestAlertException extends AbstractThrowableProblem {



    public BadRequestAlertException(String message) {
        super(ErrorConstants.DEFAULT_TYPE, "请求错误", Status.BAD_REQUEST, message);
    }

	public static BadRequestAlertException getInstance(String message) {
		// TODO Auto-generated method stub
		return new BadRequestAlertException(message);
	}    
  
}
