import java.util.Scanner;
class Emp{
    String name;
    int sal;
    Emp(String name,int sal){
        this.name=name;
        this.sal=sal;
    }
}
class Main3{
    public static void main(String[] args) {
        Emp e1=new Emp("Sameer",10);
        System.out.println(e1.name+e1.sal);
    }
}