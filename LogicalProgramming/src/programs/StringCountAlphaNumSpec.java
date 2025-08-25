package programs;
import java.util.Scanner;
public class StringCountAlphaNumSpec {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		String s= new String(ip.nextLine());
		int a=0,n=0,sc=0;
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if((c>='a'&&c<='z')||(c>='A'&&c<='Z')) {
				a++;
			}
			else if(c>='0'&&c<='9') {
				n++;
			}
			else {
				sc++;
			}
		}
		System.out.println("Alphabets: "+a);
		System.out.println("Number: "+n);
		System.out.println("Special Characters: "+sc);
		

	}

}
