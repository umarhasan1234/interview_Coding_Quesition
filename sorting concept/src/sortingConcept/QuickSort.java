package sortingConcept;

import java.util.Scanner;

public class QuickSort {
	
	public static void quickSortimpl(int arr[],int low,int high) {
		  if(low<high) {
			  int pivoteIndex=partition(arr,low,high);
			  quickSortimpl(arr,low,pivoteIndex-1);
			  quickSortimpl(arr,pivoteIndex+1,high);
		  }
	  }
	 public static int partition(int arr[],int low, int high) {
			int pivot=arr[high];
			int i=low-1;
			for(int j=low;j<high;j++) {
				if(arr[j]<pivot) {
					i++;
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			i++;
			int temp=arr[i];
			arr[i]=pivot;
			arr[high]=temp;
			return i;
		}
		  
	  public static void main(String[] args) {
		int[] arr= {6,3,9,5,2,8};
		int n=arr.length;
		quickSortimpl(arr,0,n-1);
		System.out.println("After sort the element");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		} 
		System.out.println();
	}
                                                                                                          

}
