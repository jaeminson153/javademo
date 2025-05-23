package java005_method;

public class Java055_method {

	public static void main(String[] args) {
		
		process("홍길동",true);
		save(3000);
		
		process("이영희",false);
		save(0);		
	}
	
	public static void process(String name, boolean chk) {
		if(chk) {
			System.out.printf("%s님은 회원입니다.\n",name);
		}else {
			System.out.printf("%s님은 비회원입니다.\n",name);
		}
	}
	
	public static void save(int point) {
		System.out.printf("%d 포인트가 적립되었습니다.\n", point);
	}

}
