class assignment
{
	public static void main(String[] args)
	{
		int n=15;
		String res=(n%5==0)? "yes":(n%3==0)? "no":(n%5==0 && n%3==0)? "yes":"no";
		System.out.println(res);
	}
}