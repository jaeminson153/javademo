package java002_statements;

public class Java021_switch {

//  switch(식){
//  case 값1 : 수행할 문장; break;
//  case 값2 : 수행할 문장; break;
//  case 값3 : 수행할 문장; break;
//  default : 수행할 문장;
// }
//
// 식의 결과 타입 : byte, short, char, int, enum(jdk7), String(jdk7)
// switch~case에서 break을 만나면 현재 수행중인 제어문을 완전히 빠져나옴
//	
	public static void main(String[] args) {
		int jumsu = 100;
		
		// 90 이상 A, 80이상 : B, 70이상 C, 60 이상 D, 60 미만 F		
		switch(jumsu/10) {
		
		case 10:			
		case 9: 
			System.out.printf("점수가 %d 이므로 학점은 %c입니다.\n",jumsu,'A');
			break;
		case 8: 
			System.out.printf("점수가 %d 이므로 학점은 %c입니다.\n",jumsu,'B');
			break;
		case 7: 
			System.out.printf("점수가 %d 이므로 학점은 %c입니다.\n",jumsu,'C');
			break;	
		case 6: 
			System.out.printf("점수가 %d 이므로 학점은 %c입니다.\n",jumsu,'D');
			break;
		default : 
			System.out.printf("점수가 %d 이므로 학점은 %c입니다.\n",jumsu,'F');
		}
		
		System.out.println("당신의 성적입니다.");
		//System.out.printf();
	}

}
