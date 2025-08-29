import java.util.Scanner;
class NearestPrimeNo{

    static boolean isPrime(int a){
        int c=0;
        for(int i=1;i<=a;i++){
            if(a%i==0){
                c++;
            }
        }
        if(c==2){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);
        int n=ip.nextInt();
        int c=0;
        for(int j=n;;j++){
            if(isPrime(j)==true){
                c++;
            }
            if(c==1){
                System.out.println(j);
                break;
            }
        }
        System.out.println(c);
    }
}