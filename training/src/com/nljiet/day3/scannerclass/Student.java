package com.nljiet.day3.scannerclass;

public class Student {
	private String name;
	private int id;
	private String gender;
	private int percentage;
	private int drive;
	
	public Student(String name, int id, String gender, int percentage) {
		this.name=name;
		this.id=id;
		this.gender=gender;
		this.percentage=percentage;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getPercentage() {
		return percentage;
	}

	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}

	public int getDrive() {
		return drive;
	}

	public void setDrive(int drive) {
		this.drive = drive;
	}
	
	public String toString() {
		return "{name= " + name + "id= " + id + "gender= " + gender + "percentage= " + percentage + "]";
	}

}
