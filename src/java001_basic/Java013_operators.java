package java001_basic;

public class Java013_operators {

	public static void main(String[] args) {
		
		int a = 3;
		int b = 5;
		int c = 7;
		
		boolean res;
		
		res = (++a > b ) && (++b < 3);
		
		System.out.println("res="+res);
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		int x = 4;
		int y = 8;
		int z = 10;
		
		res = (z > ++y) || (++x > y);
		System.out.printf("x=%d, y=%d, z=%d, res=%b\n", x,y,z,res);
		
		int k = 1;
		int m = 2;
		int n = 3;
		
		res = k == 2 && ++m == 2 || ++n == 4;
		System.out.printf("k=%d, m=%d, n=%d, res=%b\n", k,m,n,res);
		
		// 산술 > 비교 > 논리 > 조건 > 대입 
		
		k = 1;
		m = 2;
		n = 3;
		
		res = --k == 2 ||  m-- == 3 && ++n == 4;
		System.out.printf("k=%d, m=%d, n=%d, res=%b\n", k,m,n,res);
		
		k = 1;
		m = 2;
		n = 3;
		int p = 1;
		res = --k == --p || m-- == ++p && ++n == 4;
		System.out.printf("k=%d, m=%d, n=%d, p=%d, res=%b\n", k,m,n,p,res);
				
	}

}
