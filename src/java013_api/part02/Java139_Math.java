package java013_api.part02;

import java.util.Arrays;

public class Java139_Math {

	public static void main(String[] args) {
		int[] num = new int[5];
		
		// rotto 번호 발생하기 
		for(int i = 0 ; i < num.length ; i++) {
			//num[i] = (int)Math.floor(Math.random()*10) + 1;
			num[i] = (int)Math.floor(Math.random()*45) + 1;
			//num[i] = ((int)Math.floor(Math.random()*100)%45) + 1;
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
