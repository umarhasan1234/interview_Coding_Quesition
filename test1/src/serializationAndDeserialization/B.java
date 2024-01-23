package serializationAndDeserialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class B{
	public static void main(String[] args) {
		A a1=new A();
		try {
			FileOutputStream fos=new FileOutputStream("d://umar.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(a1);
			
			FileInputStream fis=new FileInputStream("d://umar.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			A a2=(A)ois.readObject();
			
			System.out.println(a2.a);
			System.out.println(a2.name);;
			System.out.println(a2.password);;
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
