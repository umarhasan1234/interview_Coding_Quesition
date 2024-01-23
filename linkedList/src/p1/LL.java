package p1;
import java.util.LinkedList;
public class LL {
	public static void main(String[] args) {
	  LinkedList<String> data=new LinkedList<>();
	  data.add("my");
	  data.add("Name");
	  data.addFirst("is");
	  data.addFirst("umar");//it add data at the first position
	  System.out.println(data);
	  data.addLast("hasan");
	  System.out.println(data);
	  data.remove(0);
	  System.out.println(data);
	  data.addFirst("my");
	  System.out.println(data);
	  data.remove(2);
	  System.out.println(data);
	  //inserting the data in the middle position
	  data.add(1,"name");
	  System.out.println(data);
	  // updating the data in the required position
	  data.set(3,"umar");
	  System.out.println(data);
	}

}
