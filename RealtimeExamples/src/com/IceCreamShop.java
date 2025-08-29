package com;

public class IceCreamShop {
	String name;
	String loc;
	int snum;
	
	public IceCreamShop(String name, String loc, int snum) {
		this.name = name;
		this.loc = loc;
		this.snum = snum;
	}
	
	IceCream getIceCream(String name,double price,String flavour,String type,double size) {
		IceCream ic=new IceCream(name,price,flavour,type,size);
		return ic;
	}
	
	
	
}
