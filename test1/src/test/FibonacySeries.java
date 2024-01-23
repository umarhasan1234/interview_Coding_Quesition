package test;

import java.util.Scanner;

public class FibonacySeries {
	public static void main(String[] args) {
		System.out.println("how many number you want to take fibonacy series");
		int n1=0,n2=1;
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int n3;
		System.out.print(n1+" , "+n2);
		for(int i=2;i<num;i++) {
			n3=n1+n2;
			System.out.print(" , "+n3);
					n1=n2;
					n2=n3;
		}
			
	}

}
