import java.util.Scanner;
public class FACTS {
    public static void main(String[] args) {
        Scanner m=new Scanner(System.in);
        System.out.println("Enter The Number");
        int a=m.nextInt();
        System.out.println("Factorial of the Number is "+factorial(a));
         m.close();
        
    }
    
    static int factorial( int a)
    {
        int f=1,i;
        for(i=1;i<=a;i++)
        {
            f*=i;
        }
        return f;
    
    }
    
    
}
