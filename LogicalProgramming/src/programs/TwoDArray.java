package programs;
import java.util.Scanner;
public class TwoDArray {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		int row=ip.nextInt();
		int col=ip.nextInt();
		int[][] arr=new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr[i][j]=ip.nextInt();
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}
