package programs;

public class StringCountVowels {
	public static void main(String[] args) {
		String s="sameer";
		s=s.toLowerCase();
		int co=0;
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				co++;
			}
		}
		System.out.println("Number of Vowel Characters are: "+co);
	}
}
