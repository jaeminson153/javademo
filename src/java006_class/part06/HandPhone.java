package java006_class.part06;

public class HandPhone {

	String name;
	String number;
	
	public HandPhone() {}
	
	public HandPhone(String name, String number) {
		this.name = name;
		this.number = number;
	}	
	
	void display() {
		System.out.printf("%s %s\n", name, number);
	}
	
}
