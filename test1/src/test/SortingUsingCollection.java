package test;

import java.util.Arrays;

public class SortingUsingCollection {
	public static void main(String[] args) {
		int a[]= {8,-3,9,-2,1,5};
		Arrays.sort(a);
		//List<int[]> l= Arrays.asList(a);
		//System.out.println(l);
		System.out.println("length of array");
		System.out.println(a.length);
		System.out.println("first maximum number");
		System.out.println(a[a.length-1]);
		System.out.println("second maximum number");
		System.out.println(a[a.length-2]);
		System.out.println("lowest number");
		System.out.println(a[0]);
		System.out.println("Second lowest number");
		System.out.println(a[1]);
	}
}  

