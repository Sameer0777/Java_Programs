package programs;
import java.util.Scanner;
public class ArmStNum {
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		int n=ip.nextInt();
		int n1=n,n2=n,c=0,rem=0,sum=0;
		while(n!=0) {
			n=n/10;
			c++;
		}
		while(n1!=0) {
			rem=n1%10;
			int pow=1;
			for(int i=1;i<=c;i++) {
				pow=pow*rem;
			}
			sum=sum+pow;
			n1=n1/10;
		}
		if(n2==sum) {
			System.out.println("Armstrong Number");
		}
		else {
			System.out.println("Not a Armstrong Number");
		}
	}
}
