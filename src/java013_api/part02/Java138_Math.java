package java013_api.part02;

import java.util.Random;

// Math 클래스의 모든 멤버변수, 메소드는 static 이 선언되여 있다.
// Math. 멤버변수
// Math.메소드()

public class Java138_Math {

	public static void main(String[] args) {
		System.out.println(Math.E);
		System.out.println(Math.PI);
		
		// 0.0 이상 ~ 1.0미만 
		//System.out.println(Math.random());
		double de = Math.random();
		System.out.println(de);
		
		de = de * 10;	// 0.0 이상 ~ 9.99999...까지
		System.out.println(de);
		
		System.out.println(Math.floor(de));
		System.out.println((int)Math.floor(de));	// 0~9
		System.out.println((int)Math.floor(de)+1);	// 1~10
		
		System.out.println(Math.floor(Math.random()*10) + 1);
		
	}

}
