package com;
import java.util.Scanner;
public class Problem1PEuler {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		int n=1,sum=0;
		while(n<1000) {
			if(n%5==0 || n%3==0) {
				sum=sum+n;
			}
			n++;
		}
		System.out.println(sum);

	}

}
