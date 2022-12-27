package vip.yingmen.vo;

import javax.validation.constraints.NotNull;

import io.swagger.annotations.ApiModelProperty;

public class PasswdChangeVo {
    @NotNull
    @ApiModelProperty(value = "旧密码", required = true)
	public String oldPasswd;
    @NotNull
    @ApiModelProperty(value = "新密码", required = true)
	public String newPasswd;
}
