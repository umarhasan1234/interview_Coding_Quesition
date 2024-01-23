package p1;

import java.io.File;

public class Exists {
	public static void main(String[] args) {
		File f=new File("d://coding test//umar.txt");
		boolean val=f.exists();
		System.out.println(val);
	}
}
