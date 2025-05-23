package java010_abstract_interface.part07;

public class FinalTest {
	
	// class 에서 final 선언된 변수는 대문자
	final int CODE = 1;
	
	public FinalTest() {
		// 상수에는 새로운 값을 할당 할 수 없다.
		//CODE = 2;
	}
	
	void display() {
		System.out.println("FinalTest display()");
	}
	
	final void process() {
		System.out.println("FinalTest process()");
	}
	
	
}
