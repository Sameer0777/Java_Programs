package programs;

public class FirstHalfString {

	static String firstHalf(String str) {
		String temp="";
		for(int i=0;i<str.length()/2;i++) {
			temp=temp+str.charAt(i);
		}
		return temp;
	}
	public static void main(String[] args) {
		String s="HelloThere";
		System.out.println(firstHalf(s));
	}
}
