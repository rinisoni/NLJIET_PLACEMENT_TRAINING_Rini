package com.nljiet.day2;

public class Watch {
    private String colour,price,brand; //declare data members as private and functions as public
	/*public void setData() {
		colour= "black";
		price="5k";
		brand="guess";
	}*/
	/*public void displayData() {
		System.out.print(colour + " " + price + " " + brand);
	}*/
	
	//getter setter methods
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	//override
	public String toString() {
		return "Watch [brand= " + brand + " colour= " + colour + " price= " +price + "]";	}
	//shortcut-right click ->source -> generate getters and setters
	
}
//keeping the data member private is abstraction - data hiding
//keeping all the data together and giving it a common name is encapsulation
//also try making a different package and accessing the object or methods from there.
//if we want to access only specific data, without running the entire function, then we have to create getter and setter methods