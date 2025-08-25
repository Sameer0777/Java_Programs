package programs;

public class StringDemo {
	public static void main(String[] args) {
		String s1="hello";
		String s2="hello";
		String s3=new String("hello");
		String s4=new String("hello");
		String s5=new String("hELLO");
		
		System.out.println(s1==s2);
		System.out.println(s3==s4);
		System.out.println(s1==s3);
		System.out.println("============");
		System.out.println(s4.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println("-------------");
		System.out.println(s3.equalsIgnoreCase(s5));
		System.out.println(s1.equalsIgnoreCase(s5));
		
	}
}
