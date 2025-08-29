package programs;

public class BalancedParanthesis {

	public static void main(String[] args) {
		String s="()()(())";
		char[] arr=s.toCharArray();
		int c=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]=='(') {
				for(int j=i+1;j<arr.length;j++) {
					if(arr[j]==')') {
						c++;
						arr[j]='\0';
						break;
					}
				}
			}
		}
		if(c*2==arr.length) {
			System.out.println("Balanced "+c);
		}
		else {
			System.out.println("Unbalanced "+c);
		}

	}

}
