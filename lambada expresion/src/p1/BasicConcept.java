package p1;

import java.util.Scanner;

//import java.util.Scanner;

public class BasicConcept  {
public static void main(String[] args) {
	BasicConceptInterface b=()->{
		System.out.println("Enter the numbeer");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int temp=0;
		if(num<2) {
			System.out.println("number is non prime.");
		}else {
			for(int i=2;i<=num/2;i++) {
				if(num%i==0) {
					
					++temp;
					break;
				}
				
			}
			if(temp>0) {
				System.out.println("number is non prime number");
			}
			else {
				System.out.println("number is prime number");
			}
		}
		
	};
	b.checkPrimeNumber();

}}