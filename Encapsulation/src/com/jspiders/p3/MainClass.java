package com.jspiders.p3;

public class MainClass {
	public static void main(String[] args) {
		System.out.println("main method started");
		
		Employee e1=new Employee(777,"SAMEER",50000);
		System.out.println("Employee id: "+e1.getId());
		System.out.println("Employee name: "+e1.getName());
		System.out.println("Employee salary: "+e1.getSalary());
		
		System.out.println("updating employee id");
		e1.setId(7771);
		System.out.println("Updated Employee id: "+e1.getId());
		
		System.out.println("updating employee name");
		e1.setName("SAMEER SHARMA");
		System.out.println("updated employee name: "+e1.getName());
		
		
		System.out.println("main method ended");
		
	}
}
