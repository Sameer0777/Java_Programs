class Demo3{
    static int x;
    static int y;

    static{
        System.out.println("Running static block of Demo3 class");
        x=20;
        y=30;
    }
}
class MainClass3{
    public static void main(String[] args) {
        System.out.println("Main Method Started");
        System.out.println("x value is: "+Demo3.x);
        System.out.println("y value is: "+Demo3.y);
        System.out.println("Main Method Ended");
    }

    static{
        System.out.println("Running static block of MainClass");
       /*Demo3.x=10;
        * Demo3.y=10;
        */
    }
    
}