package ncs.test13;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		// Generics 적용된 맵 객체를 선언 할당한다.
		Map<String, Inventory> map = new HashMap<String, Inventory>();

		// 상품명을 키로 사용하여 저장 처리 한다.
		//Inventory i1 = new Inventory("삼성 갤럭시S7","2016.03.15", 30 );
		map.put("삼성 갤럭시S7", new Inventory("삼성 갤럭시S7","2016.03.15", 30 ));
		map.put("LG G5", new Inventory("LG G5","2016.02.25", 20 ));
		map.put("애플 아이패드 Pro", new Inventory("애플 아이패드 Pro","2016.01.23", 15 ));

		// 맵에 기록된 정보를 연속 출력한다. EntrySet() 사용한다.
		EntrySet(map);
		
		// 맵에 기록된 정보를 Inventory[] 로 변환한 다음
		// 출고 날짜를 오늘 날짜로, 출고 수량은 모두 10개로 지정한다.예외처리함
		Inventory[] inv = new Inventory[map.size()];
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.mm.dd");
		Date toDay = new Date();
		int i = 0;
		
		try {
			for (String key : map.keySet()) {
				
				inv[i] = map.get(key);
				inv[i].setGetDate(toDay);
				inv[i].setGetAmount(10);
				//inv[i].setInventoryAmount( inv[i].getPutAmount() - inv[i].getGetAmount() );
				i++;
			}
			System.out.println("출고 수량 10 적용시 ----------------------------------------------------------");
			EntrySet(map);
			
		}catch(AmountNotEnough e) {
			System.out.println("출고수량 부족시 ----------------------------------------------------------");
			System.out.println(e.getMessage());			
		}
		// 변경된 Inventory[] 의 정보를 모두 출력한다.
		
	}
	
	public static void EntrySet(Map<String, Inventory> map) {
		for (String key : map.keySet()) {
			System.out.println(map.get(key));
		}
		System.out.println();
	}

}
