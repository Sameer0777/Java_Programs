package com.jspiders.p1;

public class MainClass2 {
	public static void main(String[] args) {
		Mobile m1=new Mobile("oneplus",6);
		Sim s1=new Sim("JIO",0,1,"4G");
		
		m1.call(s1);
		s1.simDetails();
		
	}
}
