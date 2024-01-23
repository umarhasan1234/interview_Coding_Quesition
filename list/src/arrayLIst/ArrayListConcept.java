
package arrayLIst;

import java.util.ArrayList;

public class ArrayListConcept {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(5);
		System.out.println(al);
		//for adding the element in between
		al.add(2,40);
		System.out.println(al);
		//if we want to update the value
		al.set(2,6);
		System.out.println(al);
		// if we want to delete the element
		
		al.remove(3);
		System.out.println(al);
		
		//for finding the size of list
		
		int s=al.size();
		System.out.println(s);
		
		ArrayList<Integer> al1=new ArrayList<Integer>();
		al1.add(99);
		al1.add(90);
		al1.add(80);
		System.out.println(al);
		System.out.println(al1);
		 //if we want to add both object data 
		al.addAll(2,al1);
		System.out.println(al);
		//if we want to check the element is present or not
		if(al.contains(50)) {
			System.out.println("data is present");
		}
		else {
			System.out.println("data is not present");
		}
		//if we want to fetch the data from the list
		
		System.out.println(al.get(3));
		
		
		
		
		
	}
}
