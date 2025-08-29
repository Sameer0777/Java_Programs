package programs;

public class ColumnMajorAccess {
	public static void main(String[] args) {
		int[][] arr= {{18,13,34,31},{24,56,78,9},{34,5,23,45},{1,2,23,4}};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[j][i]+" ");
			}
			System.out.println();
		}
		
	}
}
