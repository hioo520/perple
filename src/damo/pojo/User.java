package damo.pojo;

import java.io.Serializable;

public class User implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String user_id;
	private String user_code;
	private String user_name;
	private String user_password;
	private String user_state;
	private String user_authority;

	public User() {
	}

	public User(String user_id, String user_code, String user_name, String user_password, String user_state,
			String user_authority) {
		super();
		this.user_id = user_id;
		this.user_code = user_code;
		this.user_name = user_name;
		this.user_password = user_password;
		this.user_state = user_state;
		this.user_authority = user_authority;
	}

	@Override
	public String toString() {
		return "Damo_user [user_id=" + user_id + ", user_code=" + user_code + ", user_name=" + user_name
				+ ", user_password=" + user_password + ", user_state=" + user_state + ", user_authority="
				+ user_authority + "]";
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getUser_code() {
		return user_code;
	}

	public void setUser_code(String user_code) {
		this.user_code = user_code;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_password() {
		return user_password;
	}

	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}

	public String getUser_state() {
		return user_state;
	}

	public void setUser_state(String user_state) {
		this.user_state = user_state;
	}

	public String getUser_authority() {
		return user_authority;
	}

	public void setUser_authority(String user_authority) {
		this.user_authority = user_authority;
	}

}
