package vip.yingmen.web.rest.errors;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.multipart.support.MissingServletRequestPartException;

/**
 * Controller advice to translate the server side exceptions to client-friendly json structures.
 * The error response follows RFC7807 - Problem Details for HTTP APIs (https://tools.ietf.org/html/rfc7807).
 */
@ControllerAdvice(basePackages = "vip.yingmen.web.rest")
public class ExceptionTranslator{
		@ResponseBody
	    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	    @ExceptionHandler(value = Exception.class)
	    public ErrorResponse exceptionHandle(Exception e) {
	    	e.printStackTrace();
	        return ErrorResponse.fail("系统内部错误", e.getMessage());
	    }
	    
	    @ResponseBody
	    @ResponseStatus(HttpStatus.BAD_REQUEST)
	    @ExceptionHandler(value =BindException.class)
	    public ErrorResponse bindExceptionHandle(BindException e) {
	           return getErrorResponse(e.getBindingResult());
	    } 

	    @ResponseBody
	    @ResponseStatus(HttpStatus.BAD_REQUEST)
	    @ExceptionHandler(value =MethodArgumentNotValidException.class)
	    public ErrorResponse methodArgumentNotValidExceptionHandle(MethodArgumentNotValidException e) {
	           return getErrorResponse( e.getBindingResult());
	    }

		private ErrorResponse getErrorResponse(BindingResult result) {
			List<FieldErrorVM> fieldErrors = result.getFieldErrors().stream()
	               .map(f -> new FieldErrorVM(f.getObjectName().replaceFirst("DTO$", ""), f.getField(), f.getCode()))
	               .collect(Collectors.toList());
	           ErrorResponse  res = ErrorResponse.fail400("请求参数有误！");
	           res.setFieldErrors(fieldErrors);
	        return res;
		} 
	    
	    @ResponseBody
//	    @ResponseStatus(HttpStatus.BAD_REQUEST)
	    @ResponseStatus(HttpStatus.OK)
	    @ExceptionHandler(value = ReqErrorException.class)
	    public ErrorResponse reqErrorExceptionHandle(ReqErrorException e) {
	        return ErrorResponse.fail400( e.msg);
	    }
	    
	    @ResponseBody
	    @ResponseStatus(HttpStatus.UNAUTHORIZED)
	    @ExceptionHandler(value = SecurityException.class)
	    public ErrorResponse securityExceptionHandle(SecurityException e) {
	        return ErrorResponse.fail("权限错误", e.msg);
	    }
	    
	    @ResponseBody
	    @ResponseStatus(HttpStatus.BAD_REQUEST)
	    @ExceptionHandler(value = MissingServletRequestParameterException.class)
	    public ErrorResponse missingServletRequestParameterExceptionHandle(MissingServletRequestParameterException e) {
	        return ErrorResponse.fail400( e.getMessage());
	    }
	    
	    @ResponseBody
	    @ResponseStatus(HttpStatus.BAD_REQUEST)
	    @ExceptionHandler(value = MissingServletRequestPartException.class)
	    public ErrorResponse missingServletRequestPartExceptionHandle(MissingServletRequestPartException e) {
	        return ErrorResponse.fail400(e.getMessage());
	    }
	    @ResponseBody
	    @ResponseStatus(HttpStatus.METHOD_NOT_ALLOWED)
	    @ExceptionHandler(value = HttpRequestMethodNotSupportedException.class)
	    public ErrorResponse httpRequestMethodNotSupportedExceptionHandle(HttpRequestMethodNotSupportedException e) {
	        return ErrorResponse.fail("请求方式错误，不支持", e.getMessage());
	    }
}
