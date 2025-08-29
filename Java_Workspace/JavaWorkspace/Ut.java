class Ut
{
	public static void main(String[] args)
	{
		int a= -3,b;
		b=a++ - --a + a-- - --a + ++a - --a + a-- - ++a ;
		System.out.println(b);
	}
}