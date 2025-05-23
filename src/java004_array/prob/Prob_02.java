package java004_array.prob;
/*
 * 4행 4열 data배열에 가로 세로 합계를 구하는 프로그램을 구현하시오.
 * [출력결과]
 *  1   2   3   6
 *  4   5   6  15
 *  7   8   9  24
 * 12  15  18  45
 */

public class Prob_02 {

	public static void main(String[] args) {
		int[][] data = new int[4][4];
		int cnt = 1;
		int num = 1;
		int sum = 0;
		// 여기를 구현하시오.
		for(int i = 0 ; i < 3 ; i++) {
			sum = 0;
			for(int j = 0 ; j < 3 ; j++) {
				data[i][j] = num++;
				sum += data[i][j];
			}
			data[i][3] = sum;
		}
		
		for(int j = 0; j < 4 ; j++) {
			sum = 0;
			for(int i = 0 ; i < 3 ; i++) {
				sum += data[i][j];
			}
			data[3][j] = sum;
		}
		
		for(int i = 0 ; i < 4 ; i++) {
			for(int j = 0 ; j < 4 ; j++) {				
				System.out.printf("%4d ",data[i][j]);
				//System.out.printf("%c", j != data[i].length-1 ? '\t':'\n');
			}
			System.out.println();
			
		}
		
		
	}// end main()

}// end class


