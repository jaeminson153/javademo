package java013_api.part02;

import java.util.Random;

public class Java143_Math {

	public static void main(String[] args) {
		
		
		Random ran = new Random();
		System.out.println(ran);
		
		double r1 = ran.nextDouble();
		System.out.println(r1);
		
		int r2 = ran.nextInt();
		System.out.println(r2);
		
		int r3 = ran.nextInt(45);
		System.out.println(r3+1);
		
		double r4 = ran.nextGaussian();
		System.out.println(r4);		

	}

}
