class UnaryOperator1
{
	public static void main(String[] args)
	{
		int x=2;
		int y=x++ + x++;
		System.out.println("x value is "+x+" and y value is "+y);
		
		int a=1;
		int b=++a - ++a;
		System.out.println("a value is "+a+" and b value is "+b);
		
		int i=-1;
		int j=i-- - i--;
		System.out.println("i value is "+i+" and j value is "+j);
		
		int p=0;
		int q=--p + --p;
		System.out.println("p value is "+p+" and q value is "+q);
		
	}
}
		