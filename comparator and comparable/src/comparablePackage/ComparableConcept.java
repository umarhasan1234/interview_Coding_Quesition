package comparablePackage;

import java.util.ArrayList;


import java.util.Collections;	

public class ComparableConcept implements Comparable<ComparableConcept>{
	private int id;
	private String name;
	public String city;
	

	public ComparableConcept(int id, String name, String city) {
		this.id = id;
		this.name = name;
		this.city = city;
	}
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public int compareTo(ComparableConcept c) {
		
		return  (this.id- c.getId());
	}
	
	

	public static void main(String[] args) {
		ArrayList<ComparableConcept> cc=new ArrayList<ComparableConcept>();
		cc.add(new ComparableConcept(2,"umar ","city"));
		cc.add(new ComparableConcept(1,"kamal","Ramnagar"));
		cc.add(new ComparableConcept(2,"hasan","bettiah"));
		cc.add(new ComparableConcept (1,"jahan","narkatiya"));
		System.out.println(cc);
		cc.forEach(a->System.out.print(a.getId()+" "));
		
		System.out.println("\nafter sorting");
		
		Collections.sort(cc);
		cc.forEach(a->System.out.print(a.getId()+" "));
	}
//	@Override
//	public String toString() {
//		return "(id=" + id + ", name=" + name + ", city=" + city + ")";
//	}
//

}
