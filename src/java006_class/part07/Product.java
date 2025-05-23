package java006_class.part07;

public class Product {

	String code;
	String pname;
	int cnt;
	
	public Product() {	
		this("002","자전거",11);
		System.out.println("메개변수 없는 생성자.");
	}
	
	public Product(String code, String pname, int cnt) {
		//this();				// 생성자 호출시 제일 먼저 호출되어야 한다.
		this.code = code;
		this.pname = pname;
		this.cnt = cnt;		
	}
	
	public void display() {
		System.out.printf("%s %s %d\n",code, pname, cnt);
	}
	
	void process() {
		this.display();
	}
}
