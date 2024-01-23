package p1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizerClass {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the paragraph");
		String s=sc.nextLine();
		System.out.println(s);
		StringTokenizer st=new StringTokenizer(s);
		int cout=0;
		int c=st.countTokens();
		String str[]=new String[st.countTokens()];
		System.out.println("Number of words ="+c);
		int i=0;
		while(st.hasMoreTokens()) {
			str[i]=st.nextToken();
			++i;
//		 String a=st.nextToken();
//			cout++;
//			System.out.println(a);
			//System.out.println(st.nextToken());
			System.out.println(str);
		}
		//System.out.println(cout);
		
	}


}
