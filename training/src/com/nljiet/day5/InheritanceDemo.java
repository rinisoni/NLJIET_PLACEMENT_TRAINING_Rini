package com.nljiet.day5;
//Single INheritance - one class and 
public class InheritanceDemo {

}
class Parent //if we deckare parent class final, then inheritance cannot be performed.
//example - final class Person{}
{
	
	void property() {
		System.out.println("Cash. Plots, Gold");
	}
	void marry() { //if we declare a method final then it cannot be overridden.
		//example- final void marry()
		System.out.println("Srilatha");
	}
	
}
class Child extends Parent
{//code re-usability ------> 1. Development time will reduce 
	//2. Code size is reduced.
	//3. Lesser resources required

	//method overriding
	void marry() {
		System.out.println("Katrina");
	}
}

//one technical example of single inheritance is a phone company that is a parent class
//and the phone models manufactured are subclasses or child classes.
