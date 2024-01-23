package arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {
	public static void main(String[] args) {
		ArrayList<Integer> x=new ArrayList<Integer>();
		x.add(10);
		x.add(20);
		x.add(1500);
		System.out.println("add(index,value)method():-"+x);
		ArrayList<Integer> y=new ArrayList<Integer>();
		y.add(300);
		y.add(500);
		
		System.out.println(y);
		x.addAll(1,y);
		System.out.println("addAll(index,collection)method();"+x);
	System.out.println(x.size());
	if(x.contains(500)) {
		System.out.println("true");
	}
	else {
		System.out.println("false");
	}
	x.remove(4);
	System.out.println(x);
	System.out.println(x.get(2));
	Iterator it=x.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	
	}

}
