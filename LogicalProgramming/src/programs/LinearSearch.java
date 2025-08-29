package programs;
import java.util.Scanner;
public class LinearSearch {
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.println("enter size");
		int size=ip.nextInt();
		int[] arr=new int[size];
		int pos=-1;
		for(int i=0;i<arr.length;i++) {
			arr[i]=ip.nextInt();
			}
		int key=ip.nextInt();
		for(int i=0;i<arr.length;i++) {
			if(key==arr[i]) {
				pos=i;
				System.out.println("Key found at pos: "+pos);
				break;
			}
		}
		if(pos==-1) {
			System.out.println("Key not found at pos: "+pos);
		}
		}
	}

