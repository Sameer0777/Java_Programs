package com;

public class StationaryShop {
	String sname;
	String location;
	int snum;
	
	public StationaryShop(String sname, String location, int snum) {
		this.sname = sname;
		this.location = location;
		this.snum = snum;
	}
	
	Pen getpen(String brand,String color,double price,String type) {
		Pen p1=new Pen(brand,color,price,type);
		return p1;
	}
	
	
}
