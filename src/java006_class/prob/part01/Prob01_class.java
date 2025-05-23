package java006_class.prob.part01;

/*피자의 반지름을 10, 도넛의 반지름은 2로 한다.
 * 
 * [실행결과]
 * 자바피자의 면적은 314.0
 * 자바도넛의 면적은 12.56
 */

public class Prob01_class {

	public static void main(String[] args) {
		//여기를 구현하세요.////////////////////	
		Circle c1 = new Circle();
		Circle c2 = new Circle();
		
		c1.name = "자바피자";
		c1.radius = 10;
		c1.display();
		
		c2.name = "자바도넛";
		c2.radius = 2;
		c2.display();		

	}//end main()

}//end class
