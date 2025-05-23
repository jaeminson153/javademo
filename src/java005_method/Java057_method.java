package java005_method;

public class Java057_method {
	
	public static void main(String[] args) {
		int a = 4;
		int b = 2;
		int c = 5;
		
		int a1 = 14;
		int b1 = 12;
		int c1 = 15;
		
		System.out.println(hap(a,b,c));	
		
		int[] num = {2,3,4};
		System.out.println(plus(num));

		int[] arr = {2,3,4,5};
		System.out.println(plus(arr));
		
	}

	public static int hap(int x, int y, int z) {
				
		return x+y+z;
	}
	
	public static int plus(int[] arr) {
		int sum =0;
		
		for(int i = 0 ; i < arr.length ; i++) {
			sum += arr[i];
		}
		
		return sum;
	}

}
