class MainClass1
{
    static int x=100;//static variable

    static void test()
    {
        System.out.println("running test() method");
        int y=200;//local variable of test()
        System.out.println("y values is "+y);
        
    }

    public static void main(String[] args) {
        System.out.println("main method started");
        System.out.println("x value is "+x);
        test();
        int y=300;//local variable of main()
        System.out.println("y values is "+y);
        System.out.println("main method ended");
        
    }

}
