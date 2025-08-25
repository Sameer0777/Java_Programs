package programs;
import java.util.Scanner;
public class MaxSumInRowCol {
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
		int sum=0,rmax=arr[0][0],cmax=arr[0][0],rid=0,cid=0;
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				sum=sum+arr[i][j];
			}
			if(sum>rmax) {
				rmax=sum;
				rid=i;
			}
			sum=0;
		}
		System.out.println("row no: "+rid+" sum: "+rmax);
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				sum=sum+arr[j][i];
			}
			if(sum>cmax) {
				cmax=sum;
				cid=i;
			}
			sum=0;
		}
		System.out.println("col3 no: "+cid+" sum: "+cmax);
	}
}
