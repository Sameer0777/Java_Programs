class Person{
    String name;
    int age;
    String gender;

    void rightToVote(){
        if(age>=18){
            System.out.println("Eligible To Vote");
        }
        else{
            System.out.println("Not Eligible");
        }
    }
}
class MainClass10{
    public static void main(String[] args) {
        System.out.println("Main Method Started");

        Person p=new Person();
        p.name="SAMEER SHARMA";
        p.age=21;
        p.gender="MALE";

        System.out.println("Person Name: "+p.name+"\nAge: "+p.age+"Gender: "+p.gender);

        p.rightToVote();

        System.out.println("Main Method Ended");
    }
    
}