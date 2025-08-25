package programs;
import java.util.Scanner;
public class WholePrimeNum {
	public static boolean isPrime(int n) {
		int c=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				c++;
			}
		}
		if(c==2) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		int n=ip.nextInt();
		int rem=0;
		
		boolean a=false;
		while(n!=0) {
			a=isPrime(n);
			if(a==true) {
			}
			else {
				break;
			
		}
		n=n/10;
		}
		if(n==0) {
			System.out.println("Whole Prime Number");
		}
		else {
			System.out.println("Not a Whole Prime Number");
		}
}
}
