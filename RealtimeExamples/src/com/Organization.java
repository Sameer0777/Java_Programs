package com;

public class Organization {
	private Employee[] emp=new Employee[6];
	private int index=0;
	
	void recEmployee(Employee record) {
		if(index<emp.length) {
			emp[index++]=record;
			System.out.println("Employee Added");
		}
	}
	
	void empDetails() {
		System.out.println("-------------------------------");
		System.out.println("Name\tId\tAge\tGender\tSalary");
		System.out.println("-------------------------------");
		for (Employee employee : emp) {
			if(employee!=null) {
				System.out.println(employee.name+"\t"+employee.id+"\t"+employee.age+"\t"+employee.gender+"\t"+employee.salary);
			}
		}
	}
	
	void viewSalary() {
		for(Employee empl:emp) {
			System.out.println("-------------------------");
		System.out.println("Employee Name: "+empl.name+" Employee Salary: "+empl.salary);
		System.out.println("-------------------------");
	}
	}
	
	void viewSalary(double hike) {
		double hikedsal=0;
		for (Employee employee : emp) {
			hikedsal=employee.salary+(employee.salary*hike)/100;
			System.out.println("-------------------------");
			System.out.println("Employee Salary: "+employee.salary);
			System.out.println("Employee Hiked Salary: "+hikedsal);
			System.out.println("-------------------------");
		}
		
	}
}