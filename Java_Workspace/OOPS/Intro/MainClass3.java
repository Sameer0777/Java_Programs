class MainClass3
{
    int x=100;//non static variable
    //non static function
    void test()
    {
        System.out.println("running test() method");
    }
    public static void main(String[] args) {
        System.out.println("main method started");
        System.out.println("x value is "+new MainClass3().x);
        new MainClass3().test();
        System.out.println("main method ended");
    }
}

/*Syntax to access non static members is
 * new classname().nonstaticvariablename
 * new classname().nonstaticfunctionname()
 */