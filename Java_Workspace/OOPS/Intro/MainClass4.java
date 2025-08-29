class Demo3
{
    int a=100;
    void test()
    {
        System.out.println("running test() method");
    }
}
class MainClass4
{
    public static void main(String[] args) {
        System.out.println("main method started");
        System.out.println("a value is "+new Demo3().a);
        new Demo3().test();
        System.out.println("main method ended");
    }
}