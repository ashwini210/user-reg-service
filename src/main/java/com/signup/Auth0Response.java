/**
 * 
 */
package com.signup;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

/**
 * @author nsanda
 *
 */
@Setter
@Getter
public class Auth0Response implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1930697838289305719L;
	
	private String _id;
	private boolean email_verified;
	private String email;
	private String given_name;
	
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public boolean isEmail_verified() {
		return email_verified;
	}
	public void setEmail_verified(boolean email_verified) {
		this.email_verified = email_verified;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGiven_name() {
		return given_name;
	}
	public void setGiven_name(String given_name) {
		this.given_name = given_name;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
