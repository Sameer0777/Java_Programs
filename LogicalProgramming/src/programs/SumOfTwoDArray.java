package programs;
import java.util.Scanner;
public class SumOfTwoDArray {

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
		int sum=0;
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				sum=sum+arr[i][j];
			}
		}
		System.out.println(sum);
	}

}
