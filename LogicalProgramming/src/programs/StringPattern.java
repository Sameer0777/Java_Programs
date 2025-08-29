package programs;

public class StringPattern {

	public static void main(String[] args) {
		String s="combination";
		System.out.println(s);
		int lp=0,rp=s.length()-1;
		for(int i=0;i<s.length();i++) {
			String temp="";
			if(i%2==0) {
				rp--;
			}
			else {
				lp++;
			}
			for(int j=lp;j<=rp;j++) {
				temp=temp+s.charAt(j);
			}
			System.out.println(temp);
		}

	}

}
