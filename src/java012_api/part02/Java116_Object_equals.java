package java012_api.part02;

public class Java116_Object_equals {

	// Object equals 는 메모리 주소만 비교한다.
	public static void main(String[] args) {
		Object obj = new Object();
		System.out.println(obj.equals(""));
		
		Value v1 = new Value(10);
		Value v2 = new Value(20);
		System.out.println(v1.toString());
		System.out.println(v2.toString());
		
		System.out.println(v1==v2);
		System.out.println(v1.equals(v2));
		
		System.out.println("===============================");
		Member m1 = new Member(10);
		Member m2 = new Member(10);
		
		// 기본타입은 값을 비교하고 참조타입은 주소를 비교한다.
		System.out.println(m1);
		System.out.println(m2==m1);
		System.out.println(m1.equals(m2));
		System.out.println("===============================");
		String s1 = new String("java");
		String s2 = new String("java");
		System.out.println(s1);
		System.out.println(s1.toString());
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		String s3 = new String("jsp");
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
		
	}

}
