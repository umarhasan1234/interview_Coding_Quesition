package coparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class A {
	private int id;
	private String name;
	private int marks;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "A [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	public A(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	
public static void main(String[] args) {
	List<A> l=new ArrayList<>();
	l.add(new A(1,"Umar", 99));
	l.add(new A(8,"Amit", 87));
	l.add(new A(4,"kkmar", 99));
	l.add(new A(4,"aamar", 59));
	l.add(new A(2,"hasan",77));
	
	Collections.sort(l,new MarksBasis());
	l.forEach(x->System.out.println(x.getMarks()));
	
	Collections.sort(l,new NameBasis());
	l.forEach(x->System.out.println(x.getName()));
	
}
}
