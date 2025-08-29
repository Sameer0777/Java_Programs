public class SumWPWR {
    static int add(int a,int sum)
    {
        for(int i=1;i<=a;i++)
        {
            sum+=i;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(add(5,0));
    }
    
}
