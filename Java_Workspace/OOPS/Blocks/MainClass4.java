class Demo4{
    int x;
    int y;
    static int a;
    {
        System.out.println("running non static block");
        x=40;
        y=60;
    }

    static{
        System.out.println("Running Static block");
        a=40;
    }
}
class MainClass4{
    public static void main(String[] args) {
        System.out.println("Main Method Started");

        Demo4 d1=new Demo4();
        System.out.println("x value is: "+d1.x);
        System.out.println("y value is: "+d1.y);
        System.out.println("a value is: "+Demo4.a);
        System.out.println("--------------");

        Demo4 d2=new Demo4();
        System.out.println("x value is: "+d2.x);
        System.out.println("y value is: "+d2.y);
        System.out.println("a value is: "+Demo4.a);

        System.out.println("Main Method Ended");
    }
}