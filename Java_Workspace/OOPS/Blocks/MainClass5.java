class Demo5{
    int g;

    Demo5(){
        /*{
        System.out.println("running non static block");//complier copies non static block at begining of constructor,
                                                          so non static blocks are executed first
        g=10;
    } */
        System.out.println("running constructor block");
        g=35;
    }
    {
        System.out.println("running non static block");
        g=10;
    }
}
class MainClass5{
    public static void main(String[] args) {
        System.out.println("Main Method Started");
        Demo5 d1=new Demo5();
        System.out.println("g value is: "+d1.g);
        System.out.println("Main Method Ended ");

    }
}