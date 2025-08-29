class Demo2{
    static int s=100;
    static void test()
    {
        System.out.println("running test() method");
    }

}
class MainClass2
{
    public static void main(String[] args) {
        System.out.println("main started");
        System.out.println("s value is "+Demo2.s);
        Demo2.test();
        System.out.println("main ended");
        
    }
}

/*Syntax to access static members of one class in another class
-> classname.staticvariablename
-> classname.staticfunctionname()
*/
