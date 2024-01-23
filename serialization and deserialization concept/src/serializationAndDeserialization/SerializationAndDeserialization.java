package serializationAndDeserialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationAndDeserialization {
	public static void main(String[] args) {
		SerializationClass sc=new SerializationClass();
		try{
			FileOutputStream fos=new FileOutputStream("f://test.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(sc);
			FileInputStream fis=new FileInputStream("f://test.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			SerializationClass sc1=(SerializationClass)ois.readObject();
			System.out.println(sc1.a+" "+sc1.b);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
