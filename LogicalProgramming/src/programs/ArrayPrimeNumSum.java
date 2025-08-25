package programs;
import java.util.Scanner;
public class ArrayPrimeNumSum {
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
		System.out.println("Enter Size of Array");
		int size=ip.nextInt();
		int[] arr=new int[size];
		int sum=0;
		System.out.println("Enter Array Elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=ip.nextInt();
			if(isPrime(arr[i])==true) {
				sum=sum+arr[i];
			}
		}
		System.out.println("Sum of Prime Elements is: "+sum);
	}
}
