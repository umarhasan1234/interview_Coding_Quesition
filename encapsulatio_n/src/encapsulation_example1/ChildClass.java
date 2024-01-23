package encapsulation_example1;

public class ChildClass extends ParentClass {
	private int age;
	public static void main(String[] args) {
		ChildClass c=new ChildClass();
		c.name="Umar Hasan";
		c.age=40;
		c.setId(10001);
		int idnumber=c.getId();
		System.out.println("Name="+c.name+"Age="+c.age+"Idnumber="+idnumber);
	}

} 

