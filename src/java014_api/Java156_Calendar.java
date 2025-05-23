package java014_api;

import java.util.Calendar;

public class Java156_Calendar {

	// 2025년 5월의 마지막일과 요일을 구하라	
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int date = cal.getActualMaximum(Calendar.DATE);
		
		cal.set(Calendar.DATE, date);
		int weekday = cal.get(Calendar.DAY_OF_WEEK);
		String weekName = "";
		
		System.out.println(weekday);
		
		switch(weekday) {
			case 1 : weekName = "일요일"; break;
			case 2 : weekName = "월요일"; break;
			case 3 : weekName = "화요일"; break;
			case 4 : weekName = "수요일"; break;
			case 5 : weekName = "목요일"; break;
			case 6 : weekName = "금요일"; break;
			case 7 : weekName = "토요일"; break;
		}		
		
		System.out.printf("%d-%d-%d %s",year,month,date,weekName);
	}

}
