class Demo2{

    int x=10;
    int y=20;
}
class MainClass2{
    public static void main(String[] args) {
        System.out.println("Man Method Started");

        Demo2 d1=new Demo2();
        d1.x=40;
        d1.y=50;

        Demo2 d2=new Demo2();
        d2.x=30;
        d2.y=60;

        Demo2 d3=new Demo2();

        System.out.println("1st object x and y values are "+d1.x+" and "+d1.y);
        System.out.println("2nd object x and y values are "+d2.x+" and "+d2.y);
        System.out.println("3rd object x and y values are "+d3.x+" and "+d3.y);
        System.out.println("Main Method Ended");
    }
}