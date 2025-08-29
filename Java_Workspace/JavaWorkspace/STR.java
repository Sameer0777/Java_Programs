public class STR {
    public static void main(String[] args) {
        int marks=-1;
        if(marks>=35 && marks<=49)
        {
            System.out.println("pass");
        }
        else if(marks>=0 && marks<=34)
        {
            System.out.println("fail");
        }
        else if(marks>=80 && marks<=100)
        {
            System.out.println("passed with distinction");
        }
        else if(marks>=60 && marks<=79)
        {
            System.out.println("passed with first class");
        }
        else if(marks>=50 && marks<=59)
        {
            System.out.println("passed with second class");
        }
        else 
        {
            System.out.println("invaild");
        }

    }
    
}
