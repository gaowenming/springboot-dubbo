package com.smart.model;

import java.io.Serializable;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class User implements Serializable {

	private static final long serialVersionUID = 428092018424149926L;
	private Integer id;
	/**
	 * 用户名
	 */
	private String username;
	/**
	 * 全名
	 */
	private String fullname;
	/**
	 * 密码
	 */
	private String password;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 手机
	 */
	private String mobile;
	/**
	 * 邮箱
	 */
	private String email;
	/**
	 * 状态
	 */
	private Integer status;

}
