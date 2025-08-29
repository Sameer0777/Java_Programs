package programs;
import java.util.Scanner;
public class ArrayDemo {
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		
		System.out.println("Enter Size Of the Array");
		int size=ip.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter Array Eelements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=ip.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
