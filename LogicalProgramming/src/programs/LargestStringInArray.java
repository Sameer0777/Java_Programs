package programs;

public class LargestStringInArray {

	public static void main(String[] args) {
		String[] arr= {"hi","hello","welcome","bye","Sameer Sharma"};
		String max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i].length()>max.length()) {
				max=arr[i];
				
			}
		}
		System.out.println(max);
	}

}
