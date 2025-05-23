package java001_basic;

/**
 * Test클래스는 main(), process() 메소드를 가지고 있다.
 * java doc 주석 : 프로ㅡ램 문서를 만들때 사용하는 주서.
 * File > Export > Java > Javadoc > Next > Next > Next > VM options:-charset UTF-8 -encoding UTF-8 >Finish
 */
public class Test {

	/**
	 * main() 메소드는 실행하면 main 스레드에서 호출되어 실행됨.
	 * @param args 실행시 문장열 배열을 담는 변수222222
	 */
	public static void main(String[] args) {
		
		System.out.println("main method");

	}
	
	/**
	 * Process 메소드는 객체의 동작을 처리해 주는 메소드이다. 33333333333333333
	 */	
	public static void process() {
		System.out.println("process method");
	}

}
