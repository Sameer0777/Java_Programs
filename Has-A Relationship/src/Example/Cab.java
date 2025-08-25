package Example;

class Cab {
	String source;
	String destination;
	double time;
	double price;
	
	Location l1;

	Cab(String source, String destination, double time, double price, double distance, double latitude, double longitude, String pickuppoint) {
	
		this.source = source;
		this.destination = destination;
		this.time = time;
		this.price = price;
		
		l1=new Location(distance,latitude,longitude,pickuppoint);
	}
	
	void display() {
		System.out.println("Source Loc: "+source+"\nDestination: "+destination+"\nTime: "+time+"\nPrice: "+price);
		System.out.println("Location: ");
		System.out.println("PDistance: "+l1.distance+"\nLatitude: "+l1.latitude+"\nLongitude: "+l1.longitude+"\nPickup Point: "+l1.pickuppoint);
	}
	
}
