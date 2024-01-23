package test;

import java.util.Scanner;
public class ArmstrongNumber {
	public static void main(String[] args) {
		System.out.println("Enter number for check number is armstrong or not");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp,digit=0;
		double sum=0;
		temp=n;
		while(temp>0) {
			temp=temp/10;
			digit++;
		}
		temp=n;
		while(temp>0) {
			int x=temp%10;
			sum=sum+(Math.pow(x,digit));
			temp=temp/10;
		}
		if(sum==n) {
			System.out.println("number is armstrong ");
		}
		else {
			System.out.println("Number is not armstrong");
		}
	}

}
