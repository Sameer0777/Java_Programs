class Demo1{
    int x=10;
    int y=20;
}
class MainClass1{
    public static void main(String[] args) {
        System.out.println("Main Method Started");
        //step1
        Demo1 d1;//declaring reference variable
        //step2
        d1=new Demo1();//assigning object to reference variable
        /*we can declare reference variable and assigin object to reference variable in same line
         * Demo1 d1=new Demo1();
         */
        //step3->using reference variable,access the members(non static)
        System.out.println("Before Modifying");
        System.out.println("x value is "+d1.x);
        System.out.println("y value is "+d1.y); 

        System.out.println("Modifying x and y of object");
        //re-initialization of non-static of an object
        d1.x=100;
        d1.y=200;
        System.out.println("After Modifying");
        System.out.println("x value is "+d1.x);
        System.out.println("y value is "+d1.y); 
        System.out.println("Main Method Ended");
    }
}