package java004_array;

public class Java047_array {

	// [데이터]
	// 홍길동   90  85 40
	// 이영희  100  35 75
	//
	// [출력결과]
	// 홍길동   90  85 40 215 71.7
	// 이영희  100  35 75 210 70.0

	public static void main(String[] args) {
		
		int[][] num = {{90,85,40},{100,35,75}};
		String[] name = {"홍길동","이영희"};
		
		int sum;
		double avg;

		for(int row = 0; row < num.length ; row++) {
			sum = 0;
			System.out.printf("%s  ",name[row]);
			for(int col = 0 ; col < num[row].length ; col++) {
				sum += num[row][col];
				System.out.printf("\t%d",num[row][col]);				
			}						
			avg = sum/3.0;
			System.out.printf("\t%d\t%5.1f\n",sum,avg);
			
			
		}		
		
	}

}
