package java006_class.part04;

public class Java069_class {

	public static void main(String[] args) {

		MenuShop ms1 = new MenuShop();
		ms1.menu = "떡볶이";
		ms1.price = 2000;
		ms1.cnt = 3;

		MenuShop ms2 = new MenuShop();
		ms2.menu = "김말이";
		ms2.price = 500;
		ms2.cnt = 2;
		
		MenuShop ms3 = new MenuShop();
		ms3.menu = "오뎅";
		ms3.price = 300;
		ms3.cnt = 4;		
		
		ms1.display();
		ms2.display();
		ms3.display();
		
		System.out.printf("총 주문금액:%d", ms1.count()+ms2.count()+ms3.count());
	}
}
