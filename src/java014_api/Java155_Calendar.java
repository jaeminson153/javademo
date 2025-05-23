package java014_api;

import java.util.Calendar;

public class Java155_Calendar {

	public static void main(String[] args) {
		//Cannot instantiate the type Calendar
		// Calendar 는 객체생성을 할수 없
		//Calendar cal = new Calendar();
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);		// month 는 0 부터 시작된다.
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int date = cal.get(Calendar.DATE);
		//int hour = cal.get(Calendar.HOUR);	// 12시간표현됨.
		int hour = cal.get(Calendar.HOUR_OF_DAY);	// 24시간표현됨.
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		System.out.printf("%d-%d-%d %d:%d:%d \n",year,month,date,hour,minute,second);
		
		// 이번달의 마지막일 리턴
		System.out.println(cal.getActualMaximum(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));		
		
		// 오늘의 요일 리턴(일요일 ->1 , 토요일 -> 7)
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		
		//오늘의  기준으로 5일전의 날짜 지정 
		cal.add(Calendar.DATE,  -5);
		year = cal.get(Calendar.YEAR);
		month = cal.get(Calendar.MONTH)+1;
		date = cal.get(Calendar.DATE);		
		System.out.printf("%d-%d-%d %d:%d:%d \n",year,month,date,hour,minute,second);
		
		cal.set(2025, 0,1); 	// 2025-01-01
		year = cal.get(Calendar.YEAR);
		month = cal.get(Calendar.MONTH)+1;
		date = cal.get(Calendar.DATE);		
		System.out.printf("%d-%d-%d %d:%d:%d \n",year,month,date,hour,minute,second);	
		
		// 셋팅된 날까지 일수
		System.out.println(cal.get(Calendar.DAY_OF_YEAR));
		

	}

}
