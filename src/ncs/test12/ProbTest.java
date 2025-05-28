package ncs.test12;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ProbTest {

	public static void main(String[] args) {
		Properties prop = new Properties();
		// 명시한 사용 데이터를 prop 에 기록한다.

		// 데이터 설정
		prop.setProperty("1", "apple,1200,3");
		prop.setProperty("2", "banana,2500,2");
		prop.setProperty("3", "grape,4500,5");
		prop.setProperty("4", "orange,800,10");
		prop.setProperty("5", "melon,5000,2");

		// fileSave() 메소드를 호출한다.
		fileSave(prop);

		// fileOpen() 메소드를 호출한다.
		fileOpen(prop);			

	}

	// fileSave() 메소드를 구현한다.
	public static void fileSave(Properties p) {
		try (FileOutputStream fos = new FileOutputStream("data.xml")) {
			p.storeToXML(fos, "Product Data", "UTF-8");
			//System.out.println("상품 정보가 data.xml 파일에 저장되었습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// fileOpen() 메소드를 구현한다.
	public static void fileOpen(Properties p) {

		Fruit[] fruits = new Fruit[p.size()];
		
        try (FileInputStream fis = new FileInputStream("data.xml")) {
            // XML 파일에서 properties 불러오기
            p.loadFromXML(fis);

            // 각 상품 정보 출력
            for (String key : p.stringPropertyNames()) {
                String value = p.getProperty(key);
                // value는 "상품명,가격,수량" 형식
                String[] fruit = value.split(",");
                int iKey = Integer.parseInt(key);
                
                if (fruit.length == 3) {
                    //String name = fruit[0];
                    int price = Integer.parseInt(fruit[1]);
                    int quantity = Integer.parseInt(fruit[2]);                	
                	fruits[iKey-1] = new Fruit(fruit[0], price, quantity);

                	System.out.printf("%s = %s\n",key,fruits[iKey-1].toString());
                } else {
                    System.out.printf("ID: %s | 잘못된 데이터 형식: %s%n", key, value);
                }
            }
        } catch (IOException e) {
            System.err.println("파일 읽기 중 오류 발생: " + e.getMessage());
        }		
		
		
	}

}
