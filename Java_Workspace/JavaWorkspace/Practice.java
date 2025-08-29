import java.util.Scanner;
public class Practice {
   String name;
   int age;

   Practice(String name,int age){
        this.name=name;
        this.age=age;
   }
}
class MainClass7{
    public static void main(String[] args) {
    Scanner ip=new Scanner(System.in);
    String name=ip.nextLine();
    int age=ip.nextInt();
    
    Practice p1=new Practice(name, age);
    System.out.println(p1.name);
    System.out.println(p1.age);
    }
}
