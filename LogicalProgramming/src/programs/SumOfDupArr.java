package programs;
import java.util.Scanner;
public class SumOfDupArr {
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
		int size=ip.nextInt();
	int[] arr1=new int[size];
	int[] arr2=new int[arr1.length];
	int sum=0;
	for(int i=0;i<arr1.length;i++) {
		arr1[i]=ip.nextInt();
		arr2[i]=arr1[i];
	}
	for(int i=0;i<arr1.length;i++) {
		int c=0;
		for(int j=0;j<arr2.length;j++) {
			if(arr1[i]==arr2[j]) {
				c++;
				arr2[j]=-1;
			}
		}
		if(c>1) {
			sum=sum+arr1[i];
		}
	}
	if(isPrime(sum)) {
		System.out.println("Prime Sum..!!!");
	}
	else {
		System.out.println("Not a Prime Sum..!!");
	}
}
}
