package com.nljiet.day3.accessmodifier;
//import com.nljiet.day3.accessmodifier.Employee;

public class EmployeeDemo extends Employee {
	public static void main(String[] args) {
		Employee e1=new Employee();
		EmployeeDemo e2=new EmployeeDemo();
		
		//public
		e1.setName("Rini");
		e1.printName();
		
		//deafault-withinpackage
		e1.setId(12);
		e1.printId();
		
		//protected
		e1.setEmailId("rinisoni@gmail.com");
		e1.printemailId();
		
		e2.setEmailId("rinisoni@gmail.com");
		e2.printemailId();
	}
}
