package com;

public class MainClass2 {
	public static void main(String[] args) {
		Order od1=new Order();
		
		Product p1=new Product(1234, "Mobile", 15000.00, "Electronics");
		od1.addProduct(p1);
		od1.addProduct(new Product(1235, "Train", 1500.00, "Toy"));
		od1.addProduct(new Product(1226, "Nike", 5000.00, "Accessories"));
		od1.addProduct(new Product(1237, "T-shirt", 600.00, "Clothes"));
		od1.addProduct(new Product(1238, "Radoo", 1200.00, "Watches"));
		//od1.addProduct(new Product(1239, "PenDrive", 250.00, "Electronics"));
		
		od1.viewItems();
		od1.generateBill();
		od1.generateBill(10);
	}
}
