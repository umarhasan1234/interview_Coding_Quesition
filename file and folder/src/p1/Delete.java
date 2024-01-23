package p1;

import java.io.File;

public class Delete {
	
	public static void main(String[] args) {
		File f=new File("d://coding test//umar.txt");
		boolean val=f.delete();
		System.out.println(val);
	}

}
