package programs;

public class ProjectEuler2 {

	public static void main(String[] args) {
		int i=1;
	      int n1=1,n2=2,sum=0,ans=0;
	      while(i<=n1) {
	    	  if(n1<=4000000) {
	        sum=n1+n2;
	       //System.out.print(n1);
	        n1=n2;
	        n2=sum;
	        if(n1%2==0){
		          ans=ans+n1;
		        }
	        }i++;}
	     System.out.println(ans);

	}

}
