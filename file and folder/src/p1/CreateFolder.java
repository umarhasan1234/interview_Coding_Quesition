package p1;

import java.io.File;

public class CreateFolder {
	public static void main(String[] args) {
		try {
			File f=new File("d://coding test//may24");
			boolean val=f.mkdir();
			System.out.println(val);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
