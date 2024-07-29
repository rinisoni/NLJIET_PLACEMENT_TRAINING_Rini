package com.nljiet.day6.inheritance;

//child class or sub class or derived class
public class Student extends Citizen{
	
	//student class attributes
	private int rollNo;
	private String collegeName;
	
	//default constructor
	public Student() {
		super();
	}
	
	//parameterized constructor
	public Student(String name, long adharNo, String city, long phone, int rollNo, String collegeName) {
		super(name, adharNo, city, phone);
		this.rollNo=rollNo;
		this.collegeName=collegeName;	
	}
	
	//getters() and setters()
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", collegeName=" + collegeName + "]";
	}
	
	
	
}
