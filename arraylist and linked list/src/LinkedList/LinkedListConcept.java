package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;


public class LinkedListConcept {
	public static void main(String[] args) {
		LinkedList<Integer> ll=new LinkedList<Integer>();
		ll.add(20);
		ll.add(30);
		System.out.println(ll);
		ll.addFirst(50);
		ll.addFirst(60);
		System.out.println(ll);
		ll.addLast(70);
		ll.addLast(80);
		System.out.println(ll);
		ll.remove(3);
		System.out.println(ll);
		Iterator it=ll.iterator();
		while(it.hasNext()) {
			System.out.println( it.next());
		}
	}

}
