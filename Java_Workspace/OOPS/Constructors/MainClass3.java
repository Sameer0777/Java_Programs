class Pen{
    String brand;
    String color;
    double price;

    Pen(String s1,String s2,double p1){
        brand=s1;
        color=s2;
        price=p1;
    }
}
class MainClass3{
    public static void main(String[] args) {
        System.out.println("Main Method Started");

        Pen o1=new Pen("Octane","Black",20.0);
        System.out.println("Pen Brand: "+o1.brand+"\nPen Color: "+o1.color+"\nPen price: "+o1.price);

        Pen o2=new Pen("Doms","Black",3.25);
        System.out.println("Pen Brand: "+o2.brand+"\nPen Color: "+o2.color+"\nPen price: "+o2.price);

        System.out.println("Main Method Ended");

    }
}