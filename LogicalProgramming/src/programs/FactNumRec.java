package programs;

public class FactNumRec {
	static int factNum(int n) {
		if(n==1) {
			return 1;
		}
		else {
			return n*factNum(n-1);
		}
	}
	public static void main(String[] args) {
		System.out.println(factNum(5));
	}
}
