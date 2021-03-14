package com.exam.model;

public class AuthenticationResponse {

	private String token;
	private String expiredDate;
	
	public AuthenticationResponse()
	{
		
	}

	public AuthenticationResponse(String token) {
		super();
		this.token = token;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getExpiredDate() {
		return expiredDate;
	}

	public void setExpiredDate(String expiredDate) {
		this.expiredDate = expiredDate;
	}

	public AuthenticationResponse(String token, String expiredDate) {
		super();
		this.token = token;
		this.expiredDate = expiredDate;
	}
	
	
}
