package programs;
import java.util.Scanner;
public class StringPalindrome {
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		String s=ip.nextLine();
		String temp="";
		for(int i=s.length()-1;i>=0;i--) {
			temp=temp+s.charAt(i);
			
		}
		if(s.equalsIgnoreCase(temp)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
	}
}
