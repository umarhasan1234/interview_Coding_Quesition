package test;

import java.util.Scanner;

public class StringConcept{
	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the String");
	 
	 String s=sc.nextLine();
	 StringBuilder sb=new StringBuilder(s);
	 String[] str=s.trim().split(" ");
	 System.out.println(str.length);
	 System.out.println("length="+s.length());
//	 for(int i=s.length()-1;i>=0;i--) {
//		 System.out.print(s.charAt(i));
//	 }
	 System.out.println(sb.reverse());

}
	}