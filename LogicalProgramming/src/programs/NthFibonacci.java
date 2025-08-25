package programs;
import java.util.Scanner;
public class NthFibonacci {
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		int n=ip.nextInt();
		int i=1,sum=0,n1=0,n2=1;
		while(i<n) {
			sum=n1+n2;
			n1=n2;
			n2=sum;
			i++;
		}
		System.out.println(n1);
	}
}
