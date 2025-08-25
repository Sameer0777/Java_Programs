package programs;
import java.util.Scanner;
public class SumOfPrimeDigit {
	static boolean isPrime(int n) {
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
		int rem=0,sum=0;
		while(n!=0) {
			rem=n%10;
			if(isPrime(rem)==true) {
				sum=sum+rem;
			}
			n=n/10;
		}
		System.out.println("Sum Of Prime Digits is: "+sum);
	}
}
