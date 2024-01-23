package test;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		 int test=0; 
		 System.out.println("Enter the number");
		 Scanner sc=new Scanner(System.in);
		  int n=sc.nextInt();//it is the number to be checked          
		  if(n<2){  
		   System.out.println(n+" is not prime number");      
		  }else{  
		   for(int i=2;i<=n/2;i++){      
		    if(n%i==0){      
		     System.out.println(n+" is not prime number");      
		     test++;      
		    break;      
		    }      
		   }      
		   if(test==0)  {
			   System.out.println(n+" is prime number"); 
			   }  
		  }//end of else  
	}

}
