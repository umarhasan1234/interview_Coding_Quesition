
package test;

import java.util.Scanner;

public class PalindromNumber {
	public static void main(String[] args) {
		int a,temp=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		a=sc.nextInt();
		int palindrom=a;
		while(a>0) {
			int b=a%10;
			temp=temp*10+b;
			a=a/10;
			
		}
		if(palindrom==temp) {
			System.out.println("Number is palindrom");
		}else {
			System.out.println(temp);
		}
	}

}
