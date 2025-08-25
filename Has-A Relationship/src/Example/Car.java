package Example;

class Car {
	String name;
	int model;
	double price;
	String color;
	
	Engine eg;

	Car(String name, int model, double price, String color, String etype, int power, int stroke, double torque) {
		super();
		this.name = name;
		this.model = model;
		this.price = price;
		this.color = color;
		
		eg=new Engine(etype,power,stroke,torque);
		
	}
	 void display() {
		 System.out.println("Car Name: "+name+"\nModel: "+model+"\nPrice: "+price+"\nColor: "+color);
		 System.out.println("Engine Specs:");
		 System.out.println("Engine Type: "+eg.etype+"\nPower: "+eg.power+"\nStroke: "+eg.stroke+"\nTorque: "+eg.torque);
	 }
	
	
}
