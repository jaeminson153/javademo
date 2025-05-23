package java005_method;

public class Java062_method {
//  [출력결과]
//  20(은)는 양수입니다.
//  0은 0입니다.
//  -20(은)는 음수입니다.

	public static void main(String[] args) {
		process(20);
		process(0);
		process(-20);

	}
	
	public static void process(int num) {
		String res = "";
		
		if(num > 0 )
			res = "양수";
		else if(num == 0)
			res = "0";
		else 
			res = "음수";
		
		System.out.printf("%d은 %s입니다.\n",num,res);
	}

}
