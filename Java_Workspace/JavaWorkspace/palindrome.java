import java.util.Scanner;
class StPalindrome{
    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);
        String n=ip.nextLine();
        String n1=n.toLowerCase();
        int c1=0;
        for(int i=0;i<n1.length();i++){
            char c=n1.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                c1++;
            }
        }
        System.out.println(c1);
    }
}