package java015_exception;

public class Java160_exception {
// 컴파일시 와 실행시 
// 자바스크립트도 있다.
	
	public static void main(String[] args) {
		int[] num = new int[3];
		num[0] = 10;
		System.out.println(num[0]);
		
		try {
			num[4] = 20;
			System.out.println(num[4]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException:::::");
			System.out.println(e.getMessage());
			e.printStackTrace();			
		}catch(Exception e) {
			System.out.println("Exception:::::");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		for(int i = 0 ; i<1;i++)
			System.out.println("aa");

	}

}
