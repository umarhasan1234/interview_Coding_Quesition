package p1;

import java.io.File;

public class CreateFile {
	public static void main(String[] args) {
		try {
			File f=new File("d://coding test//umar.txt");
			boolean val=f.createNewFile();
			System.out.println(val);
		} catch (Exception e) {
		
			e.printStackTrace();
		}
			
		}
}