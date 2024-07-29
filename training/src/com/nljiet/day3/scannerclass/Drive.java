package com.nljiet.day3.scannerclass;

public class Drive {
	public void calDrives(Student student) {
		if (student.getGender().equalsIgnoreCase("female")) {
			System.out.println("Student is eligible for placements");
		}
		else {
			if (student.getPercentage()>=60 && student.getPercentage()<70) {
				student.setDrive(3);
				System.out.println("Student can apply for 3 drives");
			}
			else if(student.getPercentage()>=70 && student.getPercentage()<85) {
				student.setDrive(5);
				System.out.println("Student can apply for 5 drives");
			}
			else if(student.getPercentage()>=85) {
				System.out.println("Student can apply for all drives");
			}
			else {
				System.out.println("Student is not eligible to apply for drives");
			}
		}
	}

}
