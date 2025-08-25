package programs;
import java.util.Scanner;
public class ArrayMaxMinDiff {
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		int size=ip.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<arr.length;i++) {
			arr[i]=ip.nextInt();
		}
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("Difference: "+(max-min));
	}
}
