package reverseEachWord;

import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the paragraph");
		String s=sc.nextLine();
		String[]s1=s.trim().split("\\+s");
		for(int i=0;i<s1.length;i++) {
			for(int j=s1[i].length()-1;j>=0;j--) {
				System.out.print(s1[i].charAt(j));
			}
			System.out.println(" ");
		}
	
	}

}
