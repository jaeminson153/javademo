package java003_statements;

public class Java038_dowhile {

//	do {
//		반복 수행문장;
//	}while(조건);
	
	public static void main(String[] args) {
		char chk = 'n';
		
		do {
			System.out.println("고객님 주문하시겠습니까?(y/n) \n");			
		}while(chk == 'y');

	}

}
