package com.pattern;

import java.util.Scanner;

public class Pattern1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of row and column");
		int row=sc.nextInt();
		int column=sc.nextInt();
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
