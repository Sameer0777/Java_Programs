package programs;

public class MakeWeBig {

	public static void main(String[] args) {
		int n=5196,c=0,rem=0,n1=n,num=0;
		while(n!=0) {          //String s=n+"";
			n=n/10;            //int[] arr=new int[s.length()]
			c++;
		}
		int[] arr=new int[c];
		for(int i=0;i<arr.length;i++) {
			rem=n1%10;
			arr[i]=rem;
			n1=n1/10;
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			num=(num*10)+arr[i];
		}
		System.out.println(num);

	}

}
//to eliminate two for loop
//char[] arr=s.toCharArray()
//s=new String(arr)
//System.out.println(Integer.parseInt(s))