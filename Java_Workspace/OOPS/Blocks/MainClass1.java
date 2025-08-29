class Demo1{
    static int x;
    static int y;

    static{
        System.out.println("runnning 1st static block");
        x=10;
        y=20;
    }

    static{
        System.out.println("runnning 2nd static block");
        x=45;
        y=78;
    }

    static{
        System.out.println("running 3rd static block");
        x=777;
        y=7;
    }
}
class MainClass1{
    public static void main(String[] args) {
        System.out.println("Main Method Started");
        System.out.println("x value is: "+Demo1.x);
        System.out.println("y value is: "+Demo1.y);
        System.out.println("Main Method Ended");
    }
}