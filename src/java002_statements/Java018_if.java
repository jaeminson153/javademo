package java002_statements;

public class Java018_if {
//  if(조건식){
//	  if(조건식){
//		  수행문장;
//	  }else{
//		  수행문장;
//	  }
//}else{
//	  if(조건식){
//		  수행문장;
//	  }else{
//		  수행문장;
//	  }
//}
	public static void main(String[] args) {
		
		boolean member = false;		// 회원 true  or 비회원 false
		String grade = "일반";		// 회원등급 (VIP, 일반)

		if(member) {
			
			if(grade == "VIP") {
				System.out.printf("고객님은 %s 이며 %d%% 적립 했습니다.\n",grade, 30);
				
			}else {
				System.out.printf("고객님은 %s 이며 %d%% 적립 했습니다.\n",grade, 10);
			}
			
		}else {
			System.out.printf("고객님은 %s 이며 %d%% 적립 했습니다.\n","비회원", 0);
		}
		
		System.out.println("고객님 오늘도 방문해 주셔서 감사합니다");						
	}

}
