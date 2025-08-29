package programs;

public class StringEvenRev {
	public static void main(String[] args) {
		String s="hello hi bye welcome";
		String[] arr=s.split("");
		for(int i=arr.length-1;i>=0;i--) {
			if(i%2==1) {
				String temp=arr[i];
				String rev="";
				for(int j=temp.length()-1;j>=0;j--) {
					rev=rev+temp.charAt(j);
				}
				System.out.print(rev+" ");
			}
			else {
				System.out.print(arr[i]+" ");
			}
		}
	}
}
