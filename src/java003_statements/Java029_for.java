package java003_statements;

public class Java029_for {

	public static void main(String[] args) {
		// 1~10 까지 합계를 구하는 
		int sum = 0;
		for(int i = 1; i<11;i++) {
			sum += i;
		}
		
		System.out.printf("1부터 10까지 합계는 %d 입니다.",sum);

	}

}
