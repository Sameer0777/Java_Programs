public class FunFAL {
     static int fact(int n)
    {
        int factorial=1;
        for(int i=1;i<=n;i++)
        {
            factorial*=i;

        }
        return factorial;
    }
    static int large(int a,int b)
    {
        int res=(a>b)?a:b;
        return res;
    }
    public static void main(String[] args) {
        System.out.println("factorial of number is "+fact(3));
        System.out.println("largest among given number is "+large(10,51));
    }
    
}
