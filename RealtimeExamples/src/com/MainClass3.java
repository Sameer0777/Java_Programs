package com;

public class MainClass3 {

	public static void main(String[] args) {
		Organization og=new Organization();
		
		og.recEmployee(new Employee("Sameer", 12, 21, 'M', 15000.00));
		Employee e1=new Employee("Rahul", 13, 22, 'M', 20000.00);
		og.recEmployee(e1);
		og.recEmployee(new Employee("Hemanth", 14, 22, 'M', 18000.00));
		og.recEmployee(new Employee("Sharath", 15, 22, 'M', 19000.00));
		og.recEmployee(new Employee("Darshan", 18, 24, 'M', 25000.00));
		og.recEmployee(new Employee("Sparsha", 20, 22, 'F', 15000.00));
		
		og.empDetails();
		og.viewSalary();
		og.viewSalary(10);
		

	}

}
