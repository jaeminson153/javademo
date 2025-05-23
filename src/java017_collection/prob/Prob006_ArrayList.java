package java017_collection.prob;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
 * [프로그램 실행결과]
 * 
 * 주가종목 : 삼성전자
 * 현재가격 : 10000
 * 등락가격 : 2000
 * 
 * 주가종목 : NAVER
 * 현재가격 : 7000
 * 등락가격 : 2500
 */

public class Prob006_ArrayList {

	public static void main(String[] args) {
		ArrayList<Kospi> aList = new ArrayList<Kospi>();
		aList.add(new Kospi("삼성전자", 10000, "상승가[2000]"));
		aList.add(new Kospi("현대차", 8000, "하락가[-1000]"));
		aList.add(new Kospi("POSCO", 8500, "보합[0]"));
		aList.add(new Kospi("NAVER", 7000, "상승가[2500]"));
		prnDisplay(aList);
	}// end main()

//	public static void prnDisplay(ArrayList<Kospi> aList) {
//		// 상승 종목을 출력하는 프로그램을 구현하시오.
//        Pattern pattern = Pattern.compile("\\[\\d+\\]");
//		//Matcher matcher = pattern.matcher(kospi.getFluctuation());
//		for(Kospi kospi : aList) {
//			if(kospi.getFluctuation().contains("상승")) {
//				System.out.printf("주가종목 : %s\n현재가격 : %d\n등락가격 : %s\n\n",kospi.getStock(), kospi.getPrice(), kospi.getFluctuation());
//				
//				Matcher matcher = pattern.matcher(kospi.getFluctuation());
//				
//				if(matcher.find())
//					System.out.printf("%s\n",matcher.group(1));									 
//		        
//			}
//				
//				
//		}
//
//	}// end prnDispaly()
	
	public static void prnDisplay(ArrayList<Kospi> aList) {
		// 상승 종목을 출력하는 프로그램을 구현하시오.
		//Pattern pattern = Pattern.compile("\\[[\\d]+\\]");
		Pattern pattern = Pattern.compile("[-\\d]+");			// - 와 숫자가 여러개 있는
		//Pattern pattern = Pattern.compile("\\d+");			// 숫자만
		//Pattern pattern = Pattern.compile("[\\d]+");			// 숫자만
		for (Kospi kp : aList) {
			if (kp.getFluctuation().contains("하")) {
				System.out.printf("주가종목:%s\n", kp.getStock());
				System.out.printf("현재가격:%d\n", kp.getPrice());
				Matcher matcher = pattern.matcher(kp.getFluctuation());
				if (matcher.find())
					System.out.printf("등락가격:%s\n", matcher.group());
			}
		}
	}// end prnDispaly()
	
}// end class
