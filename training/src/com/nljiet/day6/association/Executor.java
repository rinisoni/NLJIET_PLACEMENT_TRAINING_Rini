package com.nljiet.day6.association;

public class Executor {

	public static void main(String[] args) {
		Address address=new Address(123,"colaba","Mumbai",4001);
		Person person=new Person("rini Soni",address);
		System.out.println(person);
	}
}
