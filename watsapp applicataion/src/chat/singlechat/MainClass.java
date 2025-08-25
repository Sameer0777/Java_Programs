package chat.singlechat;

import java.util.Scanner;

public class MainClass {
	    public static void main(String[] args) {
	    Scanner ip=new Scanner(System.in);
	    String n=ip.nextLine();
	    int a=ip.nextInt();
	    
	    Demo p1=new Demo(n, a);
	    System.out.println(p1.name);
	    System.out.println(p1.age);
	    }
}


