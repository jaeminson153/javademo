package java001_basic;

public class Java004_casting {

	public static void main(String[] args) {
		byte  bNum = 127; 	// -128 ~ 127
		short sNum = 32767; // -32768 ~ 32767
		int   iNum = 127; 	// -2147483648 ~ 2147483647
		long  lNum = 6L; 	// 자동 형번환 됨. L or l 모두 가능 
		float fNum = 2.5f;	// F or f 
		double dNum= 4.5;	//  
		char cData = 'a';
		
		System.out.println("bNum=" + bNum);
		System.out.println("sNum=" + sNum);
		System.out.println("iNum=" + iNum);
		System.out.println("lNum=" + lNum);
		System.out.println("fNum=" + fNum);
		System.out.println("dNum=" + dNum);
		System.out.println("cData" + cData);
		
		//형변환(casting)
		// 1. 묵시적(자동) 형변환 : 작은 데이터 타입을 큰 데이터 타입으로 변환할때 발생
		// 2. 명시적(강제) 형변환 : 큰 데이터 타입을 작은 데이터 타입으로 변환할때 발생
		
		float tNum = (float)2.6;	// 강제 형변환  doule => float
		System.out.println("tNum" + tNum);
		
		int kNum = 128;
		
		// 데이타 손실이 발생되는 경우
		byte data = (byte)kNum;
		System.out.println("data="+data);
				
		
	}

}
