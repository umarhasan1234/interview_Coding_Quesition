package test;

public class ZeroShifting {
public static void main(String[] args) {
	int a[]= {5,1,0,6,3,0,3,0,0,2,5,0,4};
	int count=0;
	for(int i=0;i<a.length;i++) {
		if(a[i]!=0) {
			a[count]=a[i];
			count++;
		}
	}
	while(count<a.length) {
		a[count]=0;
		count++;
	}
	for(int i=0;i<a.length;i++) {
		System.out.print(a[i]+" ");
	}
}
}
