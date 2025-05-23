package java006_class.prob.part03;
/*
 * draw()메소드를   [실행결과]를 참조하여 구현하세요.
 * 
 * [실행결과]
 * &&&&&&&&&&
 * %%%%%%%%%%%%%%%%%%%%
 * %%%%%%%%%%%%%%%%%%%%
 * %%%%%%%%%%%%%%%%%%%%
 */



public class Prob03_class {

	public static void main(String[] args) {
		//여기를  구현하세요.
		Box box1 = new Box();
		Box box2 = new Box(20,3);
		
		box1.fill('&');
		box2.fill('%');
		
		box1.draw();
		box2.draw();
		

	}//end main()

}//end class
