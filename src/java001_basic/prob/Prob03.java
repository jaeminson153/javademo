package java001_basic.prob;

/*
1  사과를 담는데 필요한 바구니의 수를 구하는 코드이다. 
2  만일 사과의 수가 123개이고 하나의 바구니에는 10개의 사과를 담을 수 있다면,
   13개의 바구니가 필요하다
   
3  [실행결과]
    필요한 바구니의 수 : 13
 */
public class Prob03 {

	public static void main(String[] args) {
	  //여기에 구현하세요.		
		int apple = 123;
		//여기에 작성하시오.
		
		System.out.printf("3. 총사과수는 %d\n", apple);
		System.out.println("필요한 바구니의 수: "+ (apple%10==0?apple/10:apple/10+1));     
      
	}//end main()

}//end class














