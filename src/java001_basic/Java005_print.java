package java001_basic;

public class Java005_print {

	public static void main(String[] args) {
		
		byte  bNum = 127; 	// -128 ~ 127
		short sNum = 32767; // -32768 ~ 32767
		int   iNum = 127; 	// -2147483648 ~ 2147483647
		long  lNum = 6L; 	// 자동 형번환 됨. L or l 모두 가능 
		float fNum = 2.5f;	// F or f 
		double dNum= 4.5;	//  
		char cData = 'a';
		boolean eNum = true;
		String sData = "java";
				
		// 
		System.out.println(bNum + "," + sNum);
		System.out.printf("%d,%d\n", bNum, sNum);
		
		/*
		 * System.out.printf("출력형식", 값1, 값2, 값3...);
		 * 
		 * 출력기호
		 * %d : 정수(byte, short, int, long)
		 * %f : 실수 (float, double)
		 * %b : 논리 (boolean)
		 * %c : 문자 (char) 
		 * %s : 문자열 (String)
		 * %% : %
		 * \n : 줄바꿈
		 * \t : 탭
		 */		
		
		System.out.printf("%d %d %d %d\n", bNum, sNum, iNum, lNum);
		System.out.printf("%5.1f %6.2f\n", fNum, dNum);
		System.out.printf("%c %b %s\n", cData, eNum, sData);	
		System.out.printf("%d %% %d = %d\n", 5, 2, 5%2);
		
		System.out.printf("%o \n", 19);
		System.out.printf("%x \n", 19);
		System.out.printf("%s \n", Integer.toBinaryString(19));		// 2진수는 직접 변환 출력이 없다. 
		System.out.printf("%05x \n", 19);	// 0 으로 채워진다.
		System.out.printf("%-5x \n", 19);	// 왼쪽 정렬 
		
		System.out.print("java");
		System.out.print("program");
		System.out.println();
		System.out.println("jsp");		
		

	}

}
