package com.practice;

public class MainClass1 {
	public static void main(String[] args) {

	Person p1=new Person();
	p1.age=21;
	p1.name="Sameer";
	p1.gender='M';
	
	System.out.println(p1.name+" "+p1.age+" "+p1.gender);
	
	Student s1=new Student();
	s1.name="Sameer";
	s1.age=21;
	s1.gender='M';
	s1.rollno=777;
	s1.marks=80.48;
	s1.collgeName="JSP";
	
	System.out.println(s1.name+" "+s1.age+" "+s1.gender+" "+s1.rollno+" "+s1.marks+" "+s1.collgeName);
	
	Employee e1=new Employee();
	e1.name="Sameer";
	e1.age=21;
	e1.gender='M';
	e1.id=327;
	e1.salary=347543;
	e1.designation="SE";
	
	System.out.println(e1.name+" "+e1.age+" "+e1.gender+" "+e1.id+" "+e1.salary+" "+e1.designation);
	
	}
}
