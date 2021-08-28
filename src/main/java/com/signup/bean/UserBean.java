/**
 * 
 */
package com.signup.bean;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

/**
 * @author nsanda
 *
 */
@Setter
@Getter
public class UserBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	/**
	 * For Identity
	 */
	private String fname;
	private String lname;
	private String email;
	private String userId;
	private String password;
	private String cpassword;
	private Long mobile;
	
	/**
	 * For access
	 */
	private boolean isLocked;
	private boolean isPwdChanged;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCpassword() {
		return cpassword;
	}
	public void setCpassword(String cpassword) {
		this.cpassword = cpassword;
	}
	public Long getMobile() {
		return mobile;
	}
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}
	public boolean isLocked() {
		return isLocked;
	}
	public void setLocked(boolean isLocked) {
		this.isLocked = isLocked;
	}
	public boolean isPwdChanged() {
		return isPwdChanged;
	}
	public void setPwdChanged(boolean isPwdChanged) {
		this.isPwdChanged = isPwdChanged;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	/**
	 * For Auditing
	 */
	/*private String createdBy;
	private Date createdDate;
	private String modifiedBy;
	private Date modifiedDate;*/
	
	
}
