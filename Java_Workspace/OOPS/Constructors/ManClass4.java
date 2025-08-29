class Customer{

    String name;
    int age;
    long phno;
    String address;

    Customer(String s1,int i1,long l1,String s2){
        name=s1;
        age=i1;
        phno=l1;
        address=s2;
    }

    void updatePhoneNumber(long l2){
        phno=l2;
    }

    void updateAddress(String s3){
        address=s3;
    }

}
class ManClass4{
    public static void main(String[] args) {
        System.out.println("Main Method Started");

        Customer c1=new Customer("Rahul",22,8762296758l,"Tumkur");
        System.out.println("Name: "+c1.name+"\nAge: "+c1.age+"\nPhone Number: "+c1.phno+"\nAddress: "+c1.address);

        System.out.println("Updating Customer Phone Number");
        //c1.phno=8762296758l
        c1.updatePhoneNumber(8762296759l);
        System.out.println("Updated Phone Number Is: "+c1.phno);

        System.out.println("Updating Customer Address");
        c1.updateAddress("Raichur");
        System.out.println("Updated Address Is: "+c1.address);

        System.out.println("Main Method Ended");
    }
}