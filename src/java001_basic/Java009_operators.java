package java001_basic;

public class Java009_operators {
	
//  증감연산자 : 증가연산자(++), 감소연산자(--)
//  전위연산자 : 증감연산자가 변수 앞에 있을 때
//  후위연산자 : 증감연산자가 변수 뒤에 있을 때
//  증감연산자는 리터널, 상수에서 사용 할 수 없다.

	public static void main(String[] args) {
		
		// 전위연산자
		int x = 3;
		++x;
		System.out.println("x="+x);		
		--x;
		System.out.println("x="+x);
		
		//후위 연산자
		int y= 5;
		y++;
		System.out.println("y="+y);
		y--;
		System.out.println("y="+y);
		
		// 상수 
		final int NUM = 4;
		//NUM = 10;
		//NUM++;
		System.out.println("NUM="+NUM);
				
		
	}

}
