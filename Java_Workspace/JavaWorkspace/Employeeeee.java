import java.util.Scanner;
class Employee{
   String name;
   int age;
}

class MainCLass{
    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);
        Employee e1=new Employee();
        Employee[] emp=new Employee[3];

        for (Employee i : emp) {
            System.out.println(i);
        }
    }
}