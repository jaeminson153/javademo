package java004_array;

public class Java040_array {

	public static void main(String[] args) {
		
		int[] arr = new int[] {90,80,40};
		
		for(int i = 0; i < arr.length ; i++) {
			System.out.printf("arr[%d]=%d\n",i,arr[i]);
		}		

		for(int i = arr.length-1; i >= 0 ; i--) {
			System.out.printf("arr[%d]=%d\n",i,arr[i]);
		}		
		
		int[] data = {90,80,50};
		
		for(int i = 0; i < data.length ; i++) {
			System.out.printf("data[%d]=%d\n",i,data[i]);
		}		
		
	}

}
