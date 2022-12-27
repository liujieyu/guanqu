package vip.yingmen.web.rest.errors;

import java.util.List;

import io.swagger.annotations.ApiModelProperty;

public class ErrorResponse{
	
	private String title;
	private String errcode = "400";
	private String message;
	@ApiModelProperty(value = "请求参数错误详情")
	private List<FieldErrorVM> fieldErrors;


	
	public static  ErrorResponse fail400(String msg) {
		return fail("请求错误",msg);
	}
	public static  ErrorResponse fail(String title,String msg) {
		ErrorResponse vo = new ErrorResponse();
		vo.title = title;
		vo.message = msg;
		return vo;
	}

	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public List<FieldErrorVM> getFieldErrors() {
		return fieldErrors;
	}
	public void setFieldErrors(List<FieldErrorVM> fieldErrors) {
		this.fieldErrors = fieldErrors;
	}
	public String getErrcode() {
		return errcode;
	}
	public void setErrcode(String errcode) {
		this.errcode = errcode;
	}

	
}
