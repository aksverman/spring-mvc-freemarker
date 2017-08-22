package com.rudra.aks.freemarker.model;

public class User {

	private String username;
	private String country;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	@Override
	public String toString() {
		return "User [username=" + username + ", country=" + country + "]";
	}
	
	public User() {
	}
	
	public User(String username, String country) {
		super();
		this.username = username;
		this.country = country;
	}
	
	
}
