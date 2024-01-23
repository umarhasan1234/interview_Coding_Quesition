package test;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the integer");
		int number=sc.nextInt();
		int reverse=0;
		while(number>0) {
			int temp=number%10;
			reverse=reverse*10+temp;
			number=number/10;
			
		}
		System.out.println(reverse);
	}
}
