package ncs.test14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GoodsTest {

	public static void main(String[] args) {
		// BufferedReader 에 대해 선언한다. 
		//BufferedReader br = null; 
		//Goods goods = new Goods();
		Goods goods = null; 

		//br 에 대한 키보드 입력스트림 객체 생성하고, 입력 처리하고 출력처리 한다. 
		//try catch resource 문으로 작성한다.
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("다음 항목의 값을 입력하시오.");
            System.out.print("상품명 : ");
            String name = br.readLine();  // 상품명 입력 받기
            System.out.print("가격 : ");
            String price = br.readLine();  // 가격 입력 받기
            System.out.print("수량 : ");
            String quantity = br.readLine();  // 수량 입력 받기
            goods = new Goods(name, Integer.parseInt(price), Integer.parseInt(quantity));    
            
            System.out.println();
            System.out.println("입력된 결과는 다음과 같습니다.");
            System.out.println(goods.toString());
            System.out.printf("총 구매 가갹 : %d 원", goods.getPrice()*goods.getQuantity());
            
        } catch (IOException e) {
            e.printStackTrace();
        }		
		
	}

}
