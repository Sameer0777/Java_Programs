package programs;
import java.util.Scanner;
public class ArrayMaxNum {
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=ip.nextInt();
		int[] a=new int[size];
		System.out.println("enter array elements");
		for(int i=0;i<a.length;i++) {
			a[i]=ip.nextInt();
			
		}
		int key=a[0];
		for(int j=0;j<a.length;j++) {
			if(a[j]>key) {
				key=a[j];
			}
		}
		
		System.out.println("max element is: "+key);
	}
}
