package java008_static_access.part06;

import java008_static_access.part05.Java088_access;

// ctrl + shift + o : 
public class Java090_access extends Java088_access{

	public static void main(String[] args) {
		
		// 그러나 상속관계일때는 protected 일때도 가능하다.
		//Java088_access p = new Java088_access();
		Java088_access p = new Java088_access();
//		System.out.println("var_private=%d\n", p.var_private);
//		System.out.printf("var_private=%d\n", p.var_default);
//		System.out.printf("var_protected=%d\n", p.var_protected);
		System.out.printf("var_public=%d\n", p.var_public);		
		
		System.out.println("========== 상속후 ============");
		Java090_access ps = new Java090_access();
//		System.out.println("var_private=%d\n", ps.var_private);
//		System.out.printf("var_private=%d\n", ps.var_default);
		System.out.printf("var_protected=%d\n", ps.var_protected);
		System.out.printf("var_public=%d\n", ps.var_public);		
		
	}

}
