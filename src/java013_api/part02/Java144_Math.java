package java013_api.part02;

import java.util.Arrays;
import java.util.Random;

public class Java144_Math {
	public static void main(String[] args) {
		int[] num = new int[5];
		
		Random ran = new Random();		
		// rotto 번호 발생하기 
		for(int i = 0 ; i < num.length ; i++) {

			num[i] = ran.nextInt(45)+1;

			// 중복제거 
			for(int j = 0 ; j<i ; j++) {
				if(num[j] == num[i]) {
					i--;
					break;
				}
			}
		}

		for(int data : num)
			System.out.printf("%4d",data);
		
		System.out.println();
		
		// 오름차순
		Arrays.sort(num);
		for(int data : num)
			System.out.printf("%4d",data);		
	}

}
