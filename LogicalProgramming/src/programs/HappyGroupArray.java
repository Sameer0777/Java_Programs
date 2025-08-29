package programs;
import java.util.Scanner;
public class HappyGroupArray {
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter Size of the Array: ");
		int n=ip.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter Array Elements: ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=ip.nextInt();
		}
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		//System.out.println(max);
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=max) {
				sum+=arr[i];
			}
		}
		if(sum==max) {
			System.out.println("Happy Group Array");
		}
		else {
			System.out.println("Not a Happy Group Array");
		}
	}
}
