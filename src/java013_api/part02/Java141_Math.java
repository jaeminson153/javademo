package java013_api.part02;

import static java.lang.Math.*;

public class Java141_Math {
//  난수를 이용해서 소수점 첫째자리까지 반올림해서 구하시오.
//  ex) 0.5689....   =>5.7
	public static void main(String[] args) {
		double nan = random();
		System.out.println(nan);
		nan = nan * 100;
		System.out.println(nan);
		
		System.out.println(round(nan));
		System.out.println(round(nan)/10.0);

	}

}
