class SellingPrice
{
	public static void main(String[] args)
	{
		double cp=1000,sp,p=20;
		//p=((sp-cp)/cp)*100
		sp=cp+p*cp/100;
		System.out.println(sp);
	}
}