import java.util.Scanner;
public class SumSTN {
    static int sum(int n)
    {
        int sum=0;
        for(int j=1;j<=n;j++)
        {
            sum+=j;
        }
       return sum;
    }
    public static void main(String[] args) {
        Scanner e=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=e.nextInt();
    
       System.out.println("Sum Of The Given Number Is "+sum(n));
       e.close();

    }
    
}
