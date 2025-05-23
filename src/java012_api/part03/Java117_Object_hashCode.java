package java012_api.part03;

public class Java117_Object_hashCode {

	public static void main(String[] args) {
		Person p1 = new Person("홍길동");
		Person p2 = new Person("홍길동");
		
		System.out.println(p1);
		System.out.println(p1.hashCode());	// 주소를 십진수로 변경해서 리턴.
		System.out.println(System.identityHashCode(p1));
	}

}
