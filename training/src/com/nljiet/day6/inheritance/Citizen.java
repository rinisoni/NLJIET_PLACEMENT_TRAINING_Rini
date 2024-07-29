package com.nljiet.day6.inheritance;
//demo on single inheritance ----> "Is a" relationship - Inheritance

//"Has a" ---> Association

//Parent class
public class Citizen {

	//Attributes of a Citizen
	private String name;
	private long adharNo;
	private String city;
	private long phone;
	
	//default constructor 
	//source -> Generate constructor using super class
	public Citizen() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//Parameterized constructor
	//source -> Generate constructor using fields
	public Citizen(String name, long adharNo, String city, long phone) {
		super();
		this.name = name;
		this.adharNo = adharNo;
		this.city = city;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getAdharNo() {
		return adharNo;
	}

	public void setAdharNo(long adharNo) {
		this.adharNo = adharNo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	
	
	//since attributes are private, we need getter and setters to access them

}
