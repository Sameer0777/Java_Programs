package programs;

public class AnagramString {
	static String sort(String s) {
		char[] arr=s.toCharArray();
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
				char temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			}
		}
		String s2=new String(arr);
		return s2;
		
	}

	public static void main(String[] args) {
		String s1="hello";
		String s2="eholl";
		String ans1=sort(s1);
		String ans2=sort(s2);
		if(ans1.equalsIgnoreCase(ans2)) {
			System.out.println("Anagram");
		}
		else {
			System.out.println("Not a Anagram");
		}
		
	}

}
