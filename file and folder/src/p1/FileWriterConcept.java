package p1;

import java.io.FileWriter;

public class FileWriterConcept {
	public static void main(String[] args) {
		try {
			FileWriter fw=new FileWriter("d://coding test/umar.txt",true);
			fw.write("hello umar hasan");
			char[] c= {'s','a','b'};
			fw.write(c);
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
