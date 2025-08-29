class Demo2{
    static int x;
    static int y;

    static{
        System.out.println("running static block");
        int x=45;
        int y=75;
        System.out.println("inside static block x and y are local variables");
        System.out.println("x value is: "+x);
        System.out.println("y value is: "+y);
    }
}
class MainClass2{
    public static void main(String[] args) {
        System.out.println("Main Method Started");
        System.out.println("x value is: "+Demo2.x);
        System.out.println("y value is: "+Demo2.y);
        System.out.println("Main Method Ended");
    }
}