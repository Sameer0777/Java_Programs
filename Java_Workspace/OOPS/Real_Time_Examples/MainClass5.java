class Circle{
    double radius;
    final static double  pi=3.14;
    void diameter(){
        double d1=2*radius;
        System.out.println("Diameter is "+d1);
    }

    void area(){
        double a1=pi*radius*radius;
        System.out.println("Area is "+a1);
    }

    void circumference(){

        double c1=2*pi*radius;
        System.out.println("Circumference is "+c1);
    }

}
class MainClass5{
    public static void main(String[] args) {
        System.out.println("Main Method Started");

        Circle c1=new Circle();
        c1.radius=2.1;
        System.out.println("Radius of 1st Circle is "+c1.radius);
        c1.diameter();
        c1.area();
        c1.circumference();

        Circle c2=new Circle();
        c2.radius=3.1;
        System.out.println("Radius of 2nd Circle is "+c2.radius);
        c2.diameter();
        c2.area();
        c2.circumference();
        System.out.println("Main Method Ended");
    }
    
}