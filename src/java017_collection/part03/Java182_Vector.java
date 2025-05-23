package java017_collection.part03;

import java.util.Vector;

public class Java182_Vector {
//  배열: length 키워드
// 
//  문자열 : length( )메소드
//  컬렉션 : size() 메소드
// 
//  컬렉션 클래스를 선언하고 생성할 때 제너릭 타입을 선언한다.
//  제너릭 타입을 선언하면 컬렉션 클래스에 저장된 객체를 가져올 때 다운캐스팅하는 작업을 생략할 수 있도록 제공해주는 기능이다.
//  jdk5 부터 추가됨.

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();	// 제네릭을 선언함으로 데이타에 대한 정의를 명확히 관리할수 있다.
		v.add("java");
		v.add("jsp");
		v.add("spring");
		
		System.out.println("요소의 크기 : "+v.size());
		
		for(int i = 0 ; i < v.size(); i++) {
			// Vector 를 생성할때 String 으로 세팅했기 때문에 다운케스팅을 명시하지 않아도 된다.
			String data = v.get(i);
			System.out.println(data);
		}
		
		for(String data : v)
			System.out.println(data);

	}

}
