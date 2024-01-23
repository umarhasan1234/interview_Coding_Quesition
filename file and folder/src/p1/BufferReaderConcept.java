package p1;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferReaderConcept {
	public static void main(String[] args) {
		try {
			FileReader fr=new FileReader("d://coding test/umar.txt");
			BufferedReader br=new BufferedReader(fr);
			for(int i=0;i<2;i++) {
				System.out.println(br.readLine());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
