package java003_statements;

public class Java030_for {
//  1~10까지 짝수, 홀수 누적을 계산하는 프로그램
// 
//  [출력결과]
//  홀수누적:25
//  짝수누적:30
//
	
	public static void main(String[] args) {
		
		int sumOdd = 0;
		int sumEven = 0;
		
		for(int i = 1; i<11;i++) {
//			sumOdd += i%2==1?i:0;
//			sumEven += i%2==0?i:0;
			
			if(i%2 == 0)
				sumEven += i;
			else 
				sumOdd += i;
		}		
		
		System.out.println("[출력결과]");
		System.out.printf("홀수누적:%d\n",sumOdd);
		System.out.printf("짝수누적:%d\n",sumEven);

	}

}
