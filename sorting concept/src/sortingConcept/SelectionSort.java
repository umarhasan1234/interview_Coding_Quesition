package sortingConcept;

import java.util.Scanner;

public class SelectionSort {
	public static void main(String[] args) {
		int n;
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int num[]=new int[n];
		for(int i=0;i<n;i++) {
			num[i]=sc.nextInt();
		}
		System.out.println("before sorting.");
		for(int i=0;i<n;i++) {
			System.out.println(num[i]);
		}
		for(int i=0;i<n-1;i++) {
			int smallest=num[i];
			for(int j=i+1;j<n;j++) {
				if(smallest>num[j]) {
					smallest=num[j];
					num[j]=num[i];
				}
				num[i]=smallest;
			}
		}
		System.out.println("After sorting.");
		for(int i=0;i<n;i++) {
			System.out.print(num[i]+" ");
		}
	}
}
