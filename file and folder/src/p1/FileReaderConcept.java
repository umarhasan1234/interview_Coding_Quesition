package p1;

import java.io.File;
import java.io.FileReader;

public class FileReaderConcept {
		public static void main(String[] args) {
			try {
				File f=new File("D://coding test/umar.txt");
				boolean val=f.exists();
				long size=f.length();
				System.out.println(val);
				System.out.println(size);
				FileReader fr=new FileReader(f);
				for(int i=0;i<f.length();i++) {
					System.out.print((char) fr.read());
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
		}

}
