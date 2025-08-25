package programs;
import java.util.Scanner;
public class PrimeInRange {
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
		int range=ip.nextInt();
		for(int i=1;i<=range;i++) {
			if(isPrime(i)==true) {
				System.out.println(i);
			}
		}
	}
}
