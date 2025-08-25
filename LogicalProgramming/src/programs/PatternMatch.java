package programs;

import java.util.regex.*;

public class PatternMatch {
	public static void main(String[] args) {
		String s="same173@gmail.com";
	
		Pattern p=Pattern.compile("[a-z,A-Z]{4,6}[0-9]{3,5}@gmail[.]com");
		Matcher m=p.matcher(s);
		boolean ans=m.matches();
		System.out.println(ans);
	}
}
