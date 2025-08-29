package programs;
import java.util.Scanner;
public class ArraySum {
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		
		System.out.println("Enter Size Of the Array");
		int size=ip.nextInt();
		int[] arr=new int[size];
		int sum=0;
		System.out.println("Enter Array Eelements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=ip.nextInt();
			sum=sum+arr[i];
		}
		System.out.println("Sum of the Array is: "+sum);
		//int sum=0;
		/*for(int j=0;j<arr.length;j++) {
			sum=sum+arr[j];
		}
		System.out.println("Sum of the Array is: "+sum);*/
	}

}
