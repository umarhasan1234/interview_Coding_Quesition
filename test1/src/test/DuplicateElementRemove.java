package test;



public class DuplicateElementRemove {
	public static void main(String[] args) {
		int a[]= {3,2,5,1,6,4,2,7,1,7,5,4,3,2,5,4,3,6,1,2,4};
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		for(int i=0;i<a.length;i++) {
			if(a[i]!=-000) {
				for(int j=i+1;j<a.length;j++) {
					if(a[i]==a[j]) {
						a[j]=-000;
						
					}
				}
			}
			
		}
		System.out.println("After removing this ");
		for(int i=0;i<a.length;i++) {
			if(a[i]!=-000) {
				System.out.print(a[i]+" ");
			}
		}

		
		
		
		
	}

}
