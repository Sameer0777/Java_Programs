class Pen{

    String brand="Reynolds";
    String color="Blue";
    double price=35.65;
}
class MainClass3{
    public static void main(String[] args) {
        System.out.println("Main Method Started");

        Pen p1=new Pen();
        System.out.println("Brand: "+p1.brand+" Color: "+p1.color+" Price: "+p1.price);
        System.out.println("changing Pen Color");
        
        p1.color="Black";
        System.out.println("Brand: "+p1.brand+" Color: "+p1.color+" Price: "+p1.price);

        System.out.println("Main Method Ended");
    }
    
}