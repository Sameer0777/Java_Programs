package Example;

class Customer {
	String name;
	char gender;
	long mobileno;
	String email;
	
	Address addr;

	Customer(String name, char gender, long mobileno, String email, int housenum, String streetname, String areaname, String city, String state, int pincode) {

		this.name = name;
		this.gender = gender;
		this.mobileno = mobileno;
		this.email = email;
		addr=new Address(housenum,streetname,areaname,city,state,pincode);
	}
	void details() {
		System.out.println("Name: "+name+"\nGender: "+gender+"\nMobile No: "+mobileno+"\nEmail: "+email);
		System.out.println("Address:");
		System.out.println(addr.housenum+"\n"+addr.streetname+"\n"+addr.areaname+"\n"+addr.city+"\n"+addr.state+"\n"+addr.pincode);
	}
	
	
	
}
