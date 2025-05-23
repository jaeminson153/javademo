package java004_array;

public class Java045_array {

	public static void main(String[] args) {
		
		// 2차원 배열
		// 3행 2열의 2차원 배열
		int[][] num = new int[3][2];
				
		System.out.println("===================================");
		
		num[0][0] = 1;
		num[0][1] = 2;
		num[1][0] = 3;
		num[1][1] = 4;
		num[2][0] = 5;
		num[2][1] = 6;

//		for(int row = 0; row < num.length ; row++) {
//			for(int col = 0 ; col < num[row].length ; col++) {
//				System.out.printf("num[%d][%d]=%d\t",row,col, num[row][col]);
//			}
//			System.out.println();			
//		}
		
		for(int row = 0; row < num.length ; row++) {
			for(int col = 0 ; col < num[row].length ; col++) {
				System.out.printf("num[%d][%d]=%d\t",row,col, num[row][col]);
				System.out.printf("%c", col != num[row].length-1 ? '\t':'\n');
			}
						
		}		
		
	}

}
