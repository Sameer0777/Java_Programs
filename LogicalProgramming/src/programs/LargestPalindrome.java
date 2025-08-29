package programs;
import java.util.Scanner;
public class LargestPalindrome {
	static boolean palindrome(String s) {
		String s1="";
		for(int i=0;i<s.length();i++) {
			s1=s.charAt(i)+s1;
		}
		if(s.equalsIgnoreCase(s1)) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		String s=ip.nextLine();
		String ans="";
		for(int i=0;i<s.length();i++) {
			String temp=""+s.charAt(i);
			for(int j=i+1;j<s.length();j++) {
				temp=temp+s.charAt(j);
				if(palindrome(temp)) {
					if(ans.length()<temp.length()) {
						ans=temp;
					}
				}
			}
		}
		System.out.println("Largest Palindrome is: "+ans);
	}
}
