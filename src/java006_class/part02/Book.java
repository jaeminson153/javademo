package java006_class.part02;

public class Book {

	String title;
	boolean state;
	
	String process() {
		return state?"대출가능":"대출중";
	}
	
	void display() {
		System.out.printf("%s, %s\n", title, process());
	}
}
