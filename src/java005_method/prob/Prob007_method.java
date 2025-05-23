package java005_method.prob;
/*
 * [출력결과]
 * 내림 차순 결과
    31
	22
	16
	11
	10
	9
    오름 차순 결과
	9
	10
	11
	16
	22
	31
 */

public class Prob007_method {

	public static void main(String[] args) {
		int[] arr = {10, 22, 9, 16, 11, 31};

		int[] result1 = sort(arr, "desc");
		int[] result2 = sort(arr, "asc");
		System.out.println("내림 차순 결과");
		for (int i = 0; i < result1.length; i++) {
			System.out.println(result1[i]);
		}
		System.out.println("오름 차순 결과");
		for (int i = 0; i < result2.length; i++) {
			System.out.println(result2[i]);
		}
	}//end main( )

	private static int[] sort(int[] array, String orderby) {
		// 구현하시오.
		int tmp = 0;
		int[] arrDesc  = new int[array.length];
		int[] arrAsc  = new int[array.length];
		
		for(int i = 0; i<array.length; i++) {
			arrDesc[i] = array[i];
			arrAsc[i] = array[i];
		}
		
		for(int i = 0 ; i< array.length ; i++) {
			for(int j = 0; j < array.length; j++) {
				if(orderby.equals("desc")) {
					if(arrDesc[i]> arrDesc[j]) {
						tmp = arrDesc[j];
						arrDesc[j] = arrDesc[i];
						arrDesc[i] = tmp;
					}
				}else {
					if(arrAsc[i] < arrAsc[j]) {
						tmp = arrAsc[j];
						arrAsc[j] = arrAsc[i];
						arrAsc[i] = tmp;
					}					
				}
			}
		}
	
		return orderby == "desc"? arrDesc:arrAsc;
	}//end sort( )
}