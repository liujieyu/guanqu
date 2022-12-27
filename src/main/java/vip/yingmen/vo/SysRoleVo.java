package vip.yingmen.vo;

import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Lob;
import javax.validation.constraints.NotNull;

import io.swagger.annotations.ApiModelProperty;
import vip.yingmen.domain.SysRole;
import vip.yingmen.template.BeanCopierMapper;

public class SysRoleVo  {
	public static SysRoleVo getInstance(SysRole sysRole) {
		return  BeanCopierMapper.copyObject(sysRole, SysRoleVo.class);
	}
	

		private Long id;

	    /**
	     * 名称
	     */
	    @NotNull
	    @ApiModelProperty(value = "名称", required = true)
	    @Column(name = "name", nullable = false, unique = true)
	    private String name;

	    /**
	     * 等级
	     */
	    @ApiModelProperty(value = "等级")
	    @Column(name = "grade")
	    private String grade;

	    /**
	     * 描述
	     */
	    @ApiModelProperty(value = "描述")
	    @Lob
	    @Column(name = "description")
	    private String description;

	    /**
	     * 备注
	     */
	    @ApiModelProperty(value = "备注")
	    @Lob
	    @Column(name = "remark")
	    private String remark;
	    
	    
	    /**
	     * （保存时前端忽略） 数据记录-创建时间
	     */
	    @ApiModelProperty(value = "（保存时前端忽略） 数据记录-创建时间")
	    @Column(name = "ctime")
	    private Instant ctime;

	    /**
	     * （保存时前端忽略） 数据记录-创建人
	     */
	    @ApiModelProperty(value = "（保存时前端忽略） 数据记录-创建人")
	    @Column(name = "creator")
	    private String creator;

	    /**
	     * （保存时前端忽略） 数据记录-更新时间
	     */
	    @ApiModelProperty(value = "（保存时前端忽略） 数据记录-更新时间")
	    @Column(name = "up_time")
	    private Instant upTime;

	    /**
	     * （保存时前端忽略） 数据记录-更新人
	     */
	    @ApiModelProperty(value = "（保存时前端忽略） 数据记录-更新人")
	    @Column(name = "modifier")
	    private String modifier;
	    
	    
	    
	    public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getGrade() {
			return grade;
		}

		public void setGrade(String grade) {
			this.grade = grade;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getRemark() {
			return remark;
		}

		public void setRemark(String remark) {
			this.remark = remark;
		}
	    public Instant getCtime() {
			return ctime;
		}

		public void setCtime(Instant ctime) {
			this.ctime = ctime;
		}

		public String getCreator() {
			return creator;
		}

		public void setCreator(String creator) {
			this.creator = creator;
		}

		public Instant getUpTime() {
			return upTime;
		}

		public void setUpTime(Instant upTime) {
			this.upTime = upTime;
		}

		public String getModifier() {
			return modifier;
		}

		public void setModifier(String modifier) {
			this.modifier = modifier;
		}

	

}
