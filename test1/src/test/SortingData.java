package test;

public class SortingData {

public static void quickSort(int a[],int low, int high) {
	if(low<high) {
		int pivoteIndex=partition(a,low,high);
		quickSort(a,low,pivoteIndex-1);
		quickSort(a,pivoteIndex+1,high);
	}
}
public static int partition(int a[],int low,int high) {
	int newIndex=low-1;
	int pivote=a[high];
	for(int i=0;i<high;i++) {
		if(a[i]<pivote) {
			newIndex++;
			int temp=a[newIndex];
			a[newIndex]=a[i];
			a[i]=temp;
		}
		
	}
	newIndex++;
	int temp=a[newIndex];
	a[newIndex]=pivote;
	a[high]=temp;
	return newIndex;
}
	public static void main(String[] args) {
		int a[]= {4,6,2,5,1,6,4,3,2};
		int n=a.length;
		quickSort(a,0,n-1);
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
	}
}
