package p1;

import java.util.Scanner;

public class DuplicateWordFind {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the paragraph");
		String s=sc.nextLine();
		System.out.println(s);
		s=s.toLowerCase();
		System.out.println(s);
		String[] word=s.trim().split(" ");
		for(int i=0;i<word.length;i++) {
			int count=1;
            if(word[i]!="null"){
                for(int j=i+1;j<word.length;j++) {
                    if(word[i].equals(word[j]) ) {
                        count++;
                        word[j]="null";
                    }
                    
                }
            }
			// finding duplicate words
			if(count>1 && word[i]!="null") {
				System.out.println(word[i]+" "+count+" Times");
			}
		}
		// remove duplicate words
		for(int k=0;k<word.length;k++) {
			if(word[k]!="null") {
				System.out.print(word[k]+" ");
			}
		}
	}

}
