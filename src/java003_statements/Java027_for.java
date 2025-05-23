package java003_statements;

public class Java027_for {

	public static void main(String[] args) {
		
		int sum = 0;
		int i;
		
		for(i=1; ; i++) {
			if( (sum += i) >= 15) 
				break;
			
			System.out.printf("i=%d, sum=%d \n", i, sum);										
		}
		System.out.printf("i=%d, sum=%d \n", i, sum);	
				

	}

}
