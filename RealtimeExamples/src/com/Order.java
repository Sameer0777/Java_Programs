package com;

public class Order {
	private Product[] cart=new Product[5];
	private int index=0;
	
	void addProduct(Product item) {
		if(index<cart.length) {
			cart[index++]=item;
			System.out.println("add product to cart success");
		}
		else
			System.out.println("Cart is full, cannot add items");
	}
	
	void viewItems() {
		System.out.println("-------------------------------");
		System.out.println("ID\tName\tPrice\tType");
		System.out.println("-------------------------------");
		for (Product item : cart) {
			if(item!=null) {
				System.out.println(item.id+"\t"+item.name+"\t"+item.price+"\t"+item.type);
			}
		}
	}
	
	void generateBill() {
		double totalbill=0.0;
		for(Product item:cart) {
			totalbill=totalbill+item.price;
		}
		System.out.println("-----------------------");
		System.out.println("Total Amount:\t"+totalbill);
		System.out.println("-------------------------");
	}
	
	void generateBill(int discount) {
		double totalbill=0.0;
		double discountedprice=0.0;
		for (Product item : cart) {
			totalbill=totalbill+item.price;
		}
		discountedprice=totalbill-(totalbill*discount)/100;
		
		System.out.println("-----------------------------");
		System.out.println("Total Amount:\t"+totalbill);
		System.out.println("After Discount:\t"+discountedprice);
		System.out.println("-----------------------------");
	}
}
