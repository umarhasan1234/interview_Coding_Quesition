 package reverseEachWord;

public class WithoutUsingMethod {
public static void main(String[] args) {
	String s="hhii     this  is     umar hasan";
	System.out.println(s);
	String str[]=s.trim().split("\\s+");
	for(int i=0;i<str.length;i++) {
//		StringBuilder sb=new StringBuilder(str[i]);
//		System.out.print(sb.reverse()+" ");
		String newWord=str[i];
		for(int j=newWord.length()-1;j>=0;j--) {
			System.out.print(newWord.charAt(j));
		}
		System.out.print(" ");
	}
	
}
}