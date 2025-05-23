package java012_api.part04;

public class House implements Cloneable{
	
	String name;
	int age;
	Address address;
	
	public House() {
	
	}
	
	public House(String name, int age, Address address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	public House shallowCopy() {
		House house = null;
		try {
			house = (House)super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return house;
	}
	
	public House deepCopy() {
		House house = null;
		try {
			Address add = address.clone();
			house = (House)super.clone();
			house.address = add;			 
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return house;		
	}

}
