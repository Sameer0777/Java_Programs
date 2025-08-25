package programs;
import java.util.Scanner;
public class RevStrPartialy {
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		String s=ip.nextLine();
		String temp="";
		s=s.toLowerCase();
		for(int i=0;i<s.length()/2;i++) {
			//System.out.print(s.charAt(i));
			temp=temp+s.charAt(i);
		}
		for(int i=s.length()-1;i>=s.length()/2;i--) {
			//System.out.print(s.charAt(i));
			temp=temp+s.charAt(i);
		}
		System.out.println(temp);
	}
}
