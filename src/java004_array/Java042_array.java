package java004_array;

public class Java042_array {

	public static void main(String[] args) {
		int[] num = new int[] {22,3,8,12};
		int odd = 0;
		int even = 0;
		
		for(int i = 0; i < num.length ; i++) {
			if(num[i]%2==0)
				even += num[i];
			else 
				odd += num[i];
		}		
		
		System.out.printf("짝수합 : %d,  홀수합 : %d",even,odd);
	}
	
}
