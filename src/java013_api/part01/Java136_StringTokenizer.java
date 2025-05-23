package java013_api.part01;

import java.util.StringTokenizer;

public class Java136_StringTokenizer {

	public static void main(String[] args) {
		// StringTokenizer("문자열", "구분자");
		// 문자열의 구분자가 공백일때는 2번째 파라미터값은 생략 할 수 있다.
		// StringTokenizer("java jsp");
		// 구분자 생략 하면 공백으로 처리된다.
		// 메모리에 저장된 "java" 문자열을 가져오면서 기존 메모리에 저장된 "java"문자열 메모리를 삭제한다.
		
		StringTokenizer st = new StringTokenizer("java_jsp", "_");
		System.out.println(st.countTokens());
		System.out.println(st.nextToken());
		System.out.println(st.countTokens());
		System.out.println(st.nextToken());
		System.out.println(st.countTokens());
		
		System.out.println("========= countTokens() for ===========");
		st = new StringTokenizer("java_jsp", "_");
		int count = st.countTokens();
		for(int i = 0; i< count ; i++) {
			System.out.println(st.nextToken());
		}
		
		System.out.println("========= hasMoreTokens() while ===========");
		st = new StringTokenizer("java_jsp", "_");		
		while(st.hasMoreTokens())
			System.out.println(st.nextToken());		
		
	}

}
