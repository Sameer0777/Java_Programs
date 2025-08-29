class Employee{
    //attributes
    //if we dont initialize - variables will have default values
    String name;
    int id;
    double salary;
    char gender;
    //behaviour -- opertaions performed on attributes
    void UpdateSalary(double newSalary){
        salary=newSalary;
    }
}
class MainClass1{
    public static void main(String[] args) {
        System.out.println("Main Method Started");
        //creating object of Employee
        Employee e1=new Employee();
        //initializing Employee attributes
        e1.id=7777;
        e1.name="Sameer";
        e1.salary=25000.00;
        e1.gender='M';
        //printing Employee attributes
        System.out.println("Id:"+e1.id+"\nName:"+e1.name+"\nSalary:"+e1.salary+"\nGender:"+e1.gender);
        System.out.println("Main Method Ended");
    }
}