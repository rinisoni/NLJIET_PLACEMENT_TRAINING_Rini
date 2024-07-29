package com.nljiet.day6.association;
//Person has a Address --->Container Class
public class Person {
	private String name;
	private Address address; //using address from address class
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Person(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + "]";
	}
	
	void display() {
		//if we want to display content in our own way and not as a array list then use such method in place of toString() method
	}
	
	
}
