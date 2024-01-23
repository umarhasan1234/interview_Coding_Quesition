package sortingConcept;

import java.util.Scanner;

public class BubbleSort {
		static public void main(String[] args) {
		int n;
		System.out.println("Enter the total number of length");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int num[]=new int[n];
		for(int i=0;i<n;i++) {
			num[i]=sc.nextInt();
		}
		System.out.println("your number is");
		for(int i=0;i<n;i++) {
			System.out.print(num[i]+" ");
		}
		
		//sorting code implementation
		
		for(int i=0,j=0;i<n-1 && j<n-1;i++,j++) {
			//for(int j=0;j<n-1;j++) {
				
				if(num[j]>num[j+1]) {
					int temp=num[j];
					num[j]=num[j+1];
					num[j+1]=temp;
				}
			}
		//}
		System.out.println("after sorting");
		for(int i=0;i<n;i++) {
			System.out.print(num[i]+" ");
		}
		System.out.print("\nTotal length="+num.length);
		
	}

}
