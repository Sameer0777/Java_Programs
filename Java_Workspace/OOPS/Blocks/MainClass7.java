import java.util.Scanner;
class Employee{
    String name;
    double salary;
    final String id;
    int randnum=1001;
    String shortname="CR7";

    Employee(String name,double salary){
        this.id=shortname+randnum++;
        this.name=name;
        this.salary=salary;
    }

    void details(){
        System.out.println("ID: "+id+" Name: "+name+" Salary: "+salary);
    }


}
class MainClass7{
    public static void main(String[] args) {
        System.out.println("Main Method Started");
        Scanner scn1=new Scanner(System.in);
        for(int i=0;i<5;i++){
            System.out.println("Enter employee name");
            String empname=scn1.next();
            System.out.println("Enter Employee salary");
            double empsalary=scn1.nextDouble();

            Employee e1=new Employee(empname, empsalary);
            e1.details();
        }


        
    }
}