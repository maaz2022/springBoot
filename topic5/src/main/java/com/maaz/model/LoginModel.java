package com.maaz.model;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class LoginModel {
	@NotNull(message="username requried")
	@Size(min=3,max=15,message="username must be in 3 to 8 words")
	private String username;
	@NotNull(message="password requried")
	@Size(min=8,max=15,message="password must be in 8 to 15 words")
	private String password;
	
	
	public LoginModel() {
		super();
	}
	@Override
	public String toString() {
		return "Model [username=" + username + ", password=" + password + "]";
	}
	public LoginModel(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
