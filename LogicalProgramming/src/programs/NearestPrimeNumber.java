package programs;
import java.util.Scanner;
public class NearestPrimeNumber {
	static boolean isPrime(int d) {
		int c=0;
		for(int i=1;i<=d;i++) {
			if(d%i==0) {
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
		
		if(isPrime(n)) {
			System.out.println(n+" ,"+0);
		}
		else {
			int fp=0;
			for(int i=n;;i++) {
				if(isPrime(i)) {
					break;
				}
				fp++;
			}
			int bp=0;
			for(int i=n;i>=1;i--) {
			if(isPrime(i)){
				break;
			}
			bp++;
		}
			if(bp<fp) {
				System.out.println(n-bp+" ,"+bp);
			}
			else {
				System.out.println(n+fp+" ,"+fp);
			}
		}
	}

}
