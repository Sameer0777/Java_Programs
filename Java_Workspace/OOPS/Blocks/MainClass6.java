class Demo6{
    final static int a;//we can also initialize here itself int a=20; and int b=45;
    final int b;

    static{
        a=77;
    }

    Demo6(){
        b=66;
    }
}
class MainClass6{
    public static void main(String[] args) {
        System.out.println("Main Method Started");
        Demo6 d1=new Demo6();
        System.out.println("a value is: "+Demo6.a);
        System.out.println("g value is: "+d1.b);
        System.out.println("Main Method Ended ");
        
    }
}