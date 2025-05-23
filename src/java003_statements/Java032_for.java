package java003_statements;

public class Java032_for {

//	   1   2   3   4
//	   5   6   7   8
//	   9  10  11  12
/********* 규칙을 찾아 내는게 중요하다. */	
	public static void main(String[] args) {
		
		int data = 1;
		for(int i = 0 ; i <3 ; i++) {
			
			for(int j = 1 ; j<=4; j++) 
				//System.out.printf("%4d",4*i+j);
				System.out.printf("%4d",data++);
			
			System.out.println();
						
		}

	}

}
