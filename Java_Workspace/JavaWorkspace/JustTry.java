import java.util.Scanner;
public class JustTry {
   static void disp(int[] ar){
        for (int i : ar) 
        {
            System.out.println(i);
            
        }
       
    }
    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);
        int[] arr=new int[3];
        for(int i=0;i<arr.length;i++){
            arr[i]=ip.nextInt();
        }
       disp(arr);
      

    }
   
}
    
