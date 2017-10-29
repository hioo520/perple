package damo.pojo;

import java.io.Serializable;

public class UserDetailde implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private String user_name;
	private String password;
	private String real_name;
	private String mobile;
	private String email;
	private String password_question;
	private String password_hint_answer;
	private String auth;
	private String picture;
	private String uniqueness_code;

	public UserDetailde() {
	}

	@Override
	public String toString() {
		return "UserDetailde [id=" + id + ", user_name=" + user_name + ", password=" + password + ", real_name="
				+ real_name + ", mobile=" + mobile + ", email=" + email + ", password_question=" + password_question
				+ ", password_hint_answer=" + password_hint_answer + ", auth=" + auth + ", picture=" + picture
				+ ", uniqueness_code=" + uniqueness_code + "]";
	}

	public UserDetailde(String id, String user_name, String password, String real_name, String mobile, String email,
			String password_question, String password_hint_answer, String auth, String picture,
			String uniqueness_code) {
		this.id = id;
		this.user_name = user_name;
		this.password = password;
		this.real_name = real_name;
		this.mobile = mobile;
		this.email = email;
		this.password_question = password_question;
		this.password_hint_answer = password_hint_answer;
		this.auth = auth;
		this.picture = picture;
		this.uniqueness_code = uniqueness_code;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getReal_name() {
		return real_name;
	}

	public void setReal_name(String real_name) {
		this.real_name = real_name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword_question() {
		return password_question;
	}

	public void setPassword_question(String password_question) {
		this.password_question = password_question;
	}

	public String getPassword_hint_answer() {
		return password_hint_answer;
	}

	public void setPassword_hint_answer(String password_hint_answer) {
		this.password_hint_answer = password_hint_answer;
	}

	public String getAuth() {
		return auth;
	}

	public void setAuth(String auth) {
		this.auth = auth;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getUniqueness_code() {
		return uniqueness_code;
	}

	public void setUniqueness_code(String uniqueness_code) {
		this.uniqueness_code = uniqueness_code;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
