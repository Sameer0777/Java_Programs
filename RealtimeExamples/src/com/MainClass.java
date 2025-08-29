package com;

public class MainClass {
	public static void main(String[] args) {
		System.out.println("Main Method Started");
		
		Student s1=new Student("Sameer",21,'M');
		StationaryShop sh1=new StationaryShop("Sapna","Bengaluru",777);
		
		s1.buypen(sh1, "Octane", "Black", "GelPen", 15.00);
		s1.prepareNotes("SQL");
		
		System.out.println("Main Method Ended");
		
	}
}
