package java013_api.part04;

public class Java152_Wrapper {
//  sn변수에 저장된 문자열중에서 숫자갯수를 출력하는 프로그램을 구현하시오.
//  [출력결과]
//  숫자갯수:3
	
	
	public static void main(String[] args) {
		String sn = "korea12 param3";
		int cnt = 0;
		
//		for(int i = 0 ; i<sn.length() ; i++) {
//			char data = sn.charAt(i);
//			if( '0' <= data && data <='9')
//				cnt++;
//		}
		
//		for(int i = 0 ; i<sn.length() ; i++) {
//			if( Character.isDigit(sn.charAt(i)))
//				cnt++;
//		}	
		
		char[] line = sn.toCharArray();
		for(char data : line )
			if( '0' <= data && data <='9')
				cnt++;
		
		System.out.println("숫자갯수:"+ cnt);
	}

}
