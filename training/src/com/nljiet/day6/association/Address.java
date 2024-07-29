package com.nljiet.day6.association;
//contained class

public class Address {
	private int houseNo;
	private String street;
	private String city;
	private long postalCode;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(int houseNo, String street, String city, long postalCode) {
		super();
		this.houseNo = houseNo;
		this.street = street;
		this.city = city;
		this.postalCode = postalCode;
	}
	public int getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(long postalCode) {
		this.postalCode = postalCode;
	}
	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", street=" + street + ", city=" + city + ", postalCode=" + postalCode + "]";
	}
	
	
	

}
