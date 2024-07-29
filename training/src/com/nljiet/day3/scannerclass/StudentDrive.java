package com.nljiet.day3.scannerclass;
import java.util.Scanner;

public class StudentDrive {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		String name=sc.next();
		System.out.println("Enter your id: ");
		int id=sc.nextInt();
		System.out.println("Enter your gender: ");
		String gender=sc.next();
		System.out.println("Enter your percentage: ");
		int percentage=sc.nextInt();
		
		Student s1=new Student(name, id, gender, percentage);
		Drive drive=new Drive();
		System.out.println(s1);
		drive.calDrives(s1);	
		
		sc.close();
	}

}
