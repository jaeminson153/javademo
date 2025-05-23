package java007_class.part01;

public class Java075_class {

	public static void main(String[] args) {
//		Goods g1 = new Goods("Nikon",41000,20,10);
//		System.out.println(g1.toString());
//		
//		Goods g2 = new Goods("Sony",45000,30,20);
//		System.out.println(g2.toString());		
//
//		Goods g3 = new Goods("Fujifilm",35000,10,25);
//		System.out.println(g3.toString());		

		Goods[] goods = new Goods[3];
		goods[0] = new Goods("Nikon",41000,20,10);
		goods[1] = new Goods("Sony",45000,30,20);
		goods[2] = new Goods("Fujifilm",35000,10,25);
		
		for(int i =0 ; i < goods.length; i++) {
			System.out.println(goods[i].toString());
		}
		
	}

}
