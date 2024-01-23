package p1;

public class CountNumberOfWords {
	public static void main(String[] args) {
		String s="Hello Umar How Are You";
		System.out.println("Number of characters ="+s.length());
		String[] str=s.trim().split(" ");
		System.out.println("Number of words ="+str.length);
		for(int i=0;i<str.length;i++) {
			System.out.println(str[i]);
		}
	}

} 