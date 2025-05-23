package java003_statements;

public class Java026_for {

	public static void main(String[] args) {
		
		// 누적된 값이 최초 15이상일때 까지만 반복문을 수행
		int sum = 0;
		int i;
		
		for(i=1; ; i++) {
			if( (sum += i) >= 15)
				break;			
		}
		
		System.out.printf("i=%d, sum=%d", i, sum);

	}

}
