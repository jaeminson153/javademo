package java004_array;

public class Java041_array {

	public static void main(String[] args) {
		
		int[] num = new int[] {22,3,8,12};
		int sum = 0;
		
		for(int i = 0; i < num.length ; i++) {
			sum += num[i];
		}			
		
		System.out.printf("sum=%d\n",sum);		

	}

}
