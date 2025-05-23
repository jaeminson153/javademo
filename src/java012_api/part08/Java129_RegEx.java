package java012_api.part08;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Java129_RegEx {

	public static void main(String[] args) {
		String sn = "12345";
		String st = "aetwef";
		
		System.out.println(sn.matches(".[abcd]"));	// . 임의의 문자 한개 [ or 
		System.out.println(st.matches(".*[abcdef]"));
		//a-zA-Z_*$ 가 sn변수에 포함되여 있으면 true
		// [] 는 or를 의미한다.
		// . 임의 문자이고 .* 은 임의 문자 여러개(0개 이상)을 의미한다.
		System.out.println(st.matches(".*[a-zA-Z_*$].*"));
		System.out.println(sn.matches("[0123456789]"));	// 숫자 한개를 의미함.
		System.out.println(sn.matches(".*[0-9]"));	// 숫자 한개를 의미함.
		System.out.println(sn.matches(".*[\\d]"));	// 숫자 한개를 의미함.
		System.out.println(sn.matches(".*\\d"));	// 숫자 한개를 의미함.
		System.out.println(sn.matches(".*\\D"));	// 반대의미
		System.out.println(sn.matches("[^0123456789]"));
		System.out.println(sn.matches(".*[^0-9]"));	// 숫자 한개를 의미함.
		
		String sb = "bscba5";
		System.out.println(sb.matches("2.*"));
		System.out.println(sb.matches("2.*5"));
		System.out.println(sb.matches("[ab].{5}"));	// 임의의 문자 5개 
		
		// 정규화 표현식 메소드 경우 매개변수가 regex 로 표기된다.
		
		System.out.println("===== Pattern ====");
		String input = "3aa4bsfa";
		System.out.println(input.matches("\\d"));
		
		Pattern pn = Pattern.compile("\\d");
		Matcher mc = pn.matcher(input);
		
		System.out.println(mc);
		System.out.printf("%b %s\n", mc.find(), mc.group());
		System.out.printf("%b %s\n", mc.find(0), mc.group());
		System.out.printf("%b %s\n", mc.find(1), mc.group());
		System.out.printf("%b %s\n", mc.find(2), mc.group());
		System.out.printf("%b %s\n", mc.find(3), mc.group());
		
		System.out.println("========================================");
		String str = "The BEst things in best life are best free";
		boolean res = Pattern.compile("best").matcher(str).find();
		System.out.println(res);
		
		System.out.println("========================================");
		Pattern ptPattern = Pattern.compile("best", Pattern.CASE_INSENSITIVE);
		Matcher mhMatcher = ptPattern.matcher(str);
		System.out.println(mhMatcher);		

		int i = 1;
		while (mhMatcher.find()) {
			System.out.printf("%d번째 %d~%d %s\n", i++, mhMatcher.start(), mhMatcher.end(), mhMatcher.group());
		} 
		
		System.out.println("========================================");
		System.out.println("=========10 20  30=========================");
		str = "The BEst10 things in best life are best30 free";
		ptPattern = Pattern.compile("(best)(10|20|30)", Pattern.CASE_INSENSITIVE);	
		mhMatcher = ptPattern.matcher(str);
		
		i = 1;
		while(mhMatcher.find()) {
			System.out.printf("%d번째 %d~%d %s\n", i++, mhMatcher.start(), mhMatcher.end(), mhMatcher.group());
		}


		
		
	}

}
