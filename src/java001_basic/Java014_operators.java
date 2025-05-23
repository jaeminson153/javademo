package java001_basic;

public class Java014_operators {

	public static void main(String[] args) {
		int total = 26;
		int record = 5;
		
		int res = total % record == 0 ? total/record : total/record+1;
		
		System.out.println("res="+res);
		
		int jumsu = 85;
		
		char check = jumsu >= 80 ? '상' : jumsu >= 60 ? '중' : '하';
		
		System.out.printf(" jumsu=%d, check=%c \n",jumsu,check);
		
		check = jumsu >= 60 ? jumsu >= 80 ? '상' : '중' : '하';
		System.out.printf(" jumsu=%d, check=%c",jumsu,check);

	}

}
