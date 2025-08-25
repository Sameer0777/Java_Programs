package programs;

public class RecFunnc {
	static int sum=0;
	static int sumNum(int n) {
		
		if(n>=1) {
			sum+=n;
			n--;
			sumNum(n);
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println(sumNum(5));
	}
}
