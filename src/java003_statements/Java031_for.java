package java003_statements;

public class Java031_for {

	/*
	 * 3의 배수만 제외하는 프로그램 구현 1 2 4 5 7 8 10
	 */

	public static void main(String[] args) {
		
		// i++, i = i+1; i+=1;
		for (int i = 1; i <= 10; i++) {
			if (i % 3 != 0)
				System.out.println(i);

		}

	}

}
