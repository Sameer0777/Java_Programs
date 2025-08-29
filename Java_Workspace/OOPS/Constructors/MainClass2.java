class Demo2{
    int x=1;
    int y=2;

    Demo2(int a,int b){
        System.out.println("Running Demo2 Constructor");
        x=a;
        y=b;
    }
   
}
class MainClass2{
    public static void main(String[] args) {
        System.out.println("Main Method Started");

        Demo2 d2=new Demo2(20,10);
        System.out.println("X value is: "+d2.x);
        System.out.println("Y value is: "+d2.y);

        Demo2 d3=new Demo2(56,77);
        System.out.println("X value is: "+d3.x);
        System.out.println("Y value is: "+d3.y);

        System.out.println("Main Method Ended");
    }
}