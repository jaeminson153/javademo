package java001_basic.prob;
/*
 * ko, en, jp 평균을 구해서 60점 이상이면 "합격", 60점 미만이면 "불합격"을 
 * 출력하는 프로그램을 구현하세요.
 * 
 * [출력결과]
 * 1) 합격일때
 * 평균  65.0점, 합격입니다
 * 
 * 2)불합격일때
 * 평균  34.5점, 불합격입니다
 */

public class Prob05 {

	public static void main(String[] args) {
		int ko = 90;
		int en = 45;
		int jp = 82;
		int hap = ko + en + jp;
		double avg = (double)hap/3;

		// 여기에 구현하세요.
		System.out.printf("5. 평균 구하는 ko=%d, en=%d, jp=%d , hap=%d\n", ko,en,jp,hap);
		System.out.printf("평균 %4.1f점, %s입니다.", avg, avg>=60.0?"합격":"불합격");   		
		
        
	}//end main()

}//end class





