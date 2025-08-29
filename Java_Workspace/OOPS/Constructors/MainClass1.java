class Demo1{

    int x;
    int y;

    Demo1(){
        System.out.println("Running Demo1 Constructor");
        x=100;
        y=200;
    }
}
class MainClass1{
    public static void main(String[] args) {
        System.out.println("Main Method Started");

        Demo1 d1=new Demo1();
        System.out.println("X value is: "+d1.x);
        System.out.println("Y value is: "+d1.y);
        System.out.println("X value is: "+d1.x);


        System.out.println("Main Method Ended");
    }
}