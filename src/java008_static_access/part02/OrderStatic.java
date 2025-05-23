package java008_static_access.part02;

// 멤버변수
// static{}
// 생성자(){}
// 메소드(){}
// 내부 클래스

public class OrderStatic {
	int x;			// 객체 멤버변수
	static int y;	//클레스 멥버변수
	static int z;	

	static {
		y = 5;
		System.out.println("static");
		System.out.println("y=" + y);		
	}
	
	public OrderStatic() {
		x = 10;
		System.out.println("constructor");
		System.out.println("x=" + x);		
		
	}
	
	public void display() {
		System.out.println("display");
	}
	
	public static void process() {
		System.out.println("static method");
		System.out.println("display method");
		//display()메소드는 생성(new)한 다음에 method area에 바이트코드가 저장된다.
		// process()메소는 OrderStatic 클래스는 loader하는 시점에 method area에 바이트코드가 저장된다.
		//process()메소드가 method area에 저장되는 시점이 display()보다 빠르다.		
	}
	
}
