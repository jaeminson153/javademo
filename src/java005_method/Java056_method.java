package java005_method;

import java.util.GregorianCalendar;

public class Java056_method {

	public static void main(String[] args) {
		int year = 2024;
		GregorianCalendar  dd = new GregorianCalendar();
		//boolean chk = isLeapYear(year);
		boolean chk = dd.isLeapYear(year);
		
		display(year,chk);
	}
	
	public static void display(int year,boolean chk) {
		if(chk)
			System.out.printf("%d년도는 윤년입니다.\n",year);
		else
			System.out.printf("%d년도는 평년입니다.\n",year);
	}
	
	public static boolean isLeapYear(int year) {
		
		boolean isL = false;
		if(year % 4 == 0 && year % 100 != 0 || year % 400 ==0)
			isL = true;
		
		return isL;
	}

}
