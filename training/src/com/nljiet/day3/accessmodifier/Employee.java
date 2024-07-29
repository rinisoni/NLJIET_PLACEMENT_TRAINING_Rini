package com.nljiet.day3.accessmodifier;

public class Employee {
	
	//data attributes
	private String name;
	private String emailId;
	private int id;
	
	public void printName() {
		System.out.println(getName());
	}
	public void printemailId() {
		System.out.println(getEmailId());
	}
	public void printId() {
		System.out.println(getId());
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	
}
