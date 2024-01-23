package test;

public class NegativeShifting {
	
	    public static void main(String[] args) {
	        int[] array = {5, 3, -6, 58, 0, -76, -3, 0, 1, -4, 0};
int negativeElement=0;
for(int i=0;i<array.length;i++) {
	if(array[i]<0) {
		negativeElement++;
	}
}
int newArray[]=new int[array.length];
int positive=negativeElement;
int negative=0;
for(int i=0;i<array.length;i++) {
	if(array[i]<0) {
		newArray[negative]=array[i];
		negative++;
		
	}else {
		newArray[positive]=array[i];
		positive++;
	}
}
for(int i=0;i<newArray.length;i++) {
	System.out.print(newArray[i]+" ");
}
	    
	    }
	    }