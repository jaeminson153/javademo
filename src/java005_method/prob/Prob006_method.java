package java005_method.prob;

public class Prob006_method {

	public static void main(String[] args) {
		System.out.println("<< 15 까지의 소수 >>");
		primeNumber(15);
		System.out.println("<< 32 까지의 소수 >>");
		primeNumber(32);
	}//end main( )

	private static void primeNumber(int num) {
		// 구현하세요.
		//int cnt = 0;
		boolean chk;
		for(int i =2 ; i<= num ; i++) {
			chk = true;
			for(int j = 2 ; j < i ; j++) {
				if(i%j==0) {
					chk = false;
					break;
				}	
			}
			if(chk)
				System.out.printf("%4d",i);
		}
		System.out.println();		

	}// end primeNumber( )
}//end class