public class FactWHPWR {
    static int factorial(int n,int fact)
    {
        for(int j=1;j<=n;j++)
        {
            fact*=j;
        }
        return fact;
    }
    public static void main(String[] args) {
        System.out.println(factorial(4,1));
    }
    
}
