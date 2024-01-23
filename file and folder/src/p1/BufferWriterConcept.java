package p1;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferWriterConcept {
	public static void main(String[] args) {
		try {
			FileWriter fr=new FileWriter("d://coding test/umar.txt",true);
			BufferedWriter br=new BufferedWriter(fr);
			br.write("hello mister");
			br.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
