package programs;

public class Zero1stRemainingLast {
	public static void main(String[] args) {
		int[] arr= {23,8,0,9,24,6,0,0,12};
		int[] dup=new int[arr.length];
		int k=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				dup[k]=arr[i];
				k++;
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				dup[k]=arr[i];
				k++;
			}
		}
		for(int i=0;i<dup.length;i++) {
			System.out.print(dup[i]+" ");
		}
	}
}
