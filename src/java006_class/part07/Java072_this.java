package java006_class.part07;

public class Java072_this {
//  this : 메모리에 생성된 객체 자신을 의미한다.
//  1. this.멤버변수
//  2. this.메소드()
//  3. this( ) :생성자

	public static void main(String[] args) {
		
		Product pd = new Product("001","TEST",2);		
		pd.display();
		
		Product pt = new Product();		
		pt.display();

	}

}
