package java002_statements;

public class Java022_switch {

	// 30 : 4, 6, 9, 11
	// 31 : 1, 3, 5, 7, 8, 10, 12
	// 28 or 29 : 2

	public static void main(String[] args) {
		
		int year = 2024;	//년도
		int month = 2;		//월
		int lastDay;		//마지막일
		boolean yundal = false;
		
		yundal = (year%4==0&&year%100!=0) || year%400==0?true:false;
		
		if( 1 <= month && month <= 12) {
			switch(month) {
			case 2 : lastDay = yundal?29:28; break;
			case 4  : 
			case 6  : 
			case 9  : 
			case 11 : lastDay = 30; break;
			default : lastDay=31;
			}
			System.out.printf("%d년도 %d월의 마지막일은 %d 입니다. \n",year,month,lastDay);
		}else {
			System.out.printf("%d년도 %d월은 잘못된 월입니다. \n",year,month);
		}
				

	}

}
