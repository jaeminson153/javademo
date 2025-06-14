package java018_collection.part19;


public class Person {
	private String name;
	private int age;

	public Person() {

	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return String.format("%s %d", name, age);
	}
	
//	@Override 
//	protected Person clone() throws CloneNotSupportedException {
//		return (Person)super.clone();
//	}	
	
}
