package com.isfotstone.mode;

public class Contact {

	private String name;

	private String email;

	private String telphone;

	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Contact(String name, String email, String telphone) {
		super();
		this.name = name;
		this.email = email;
		this.telphone = telphone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelphone() {
		return telphone;
	}

	public void setTelphone(String telphone) {
		this.telphone = telphone;
	}

}
