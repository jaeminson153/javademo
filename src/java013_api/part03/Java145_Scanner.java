package java013_api.part03;

import java.util.Scanner;

// java.util.Scanner : jdk 5 부터 추가
public class Java145_Scanner {

	public static void main(String[] args) {
		
		// 콘솔창으로 데이터를 읽어오기 위해서 콘솔창과 연결
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름:");
		
		//String name = sc.next();		// 공백까지 읽는다.
		String name = sc.nextLine();	// 무조건 한 라인을 읽는다.
		System.out.println(name);
		
		sc.close();

	}

}
