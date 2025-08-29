public class SmallestNumber {
    public static void main(String[] args) {
        int a=20,b=10,c=30;
        int res;
        res=(a<b && a<c)?a:(b<c)?b:c;
        System.out.println("Smallest of three numbers is "+res);
    }
    
}
