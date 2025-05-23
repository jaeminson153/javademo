package java018_collection.part11;

public class Java198_User {

	public static void main(String[] args) {
		Integer[] it = new Integer[] {1,5,3,2};
		Average<Integer> av = new Average<>(it);
		System.out.println(av.findAverage());
		
		Number[] nb = new Number[] {2,2.5f, 4.5,10L};
		Average<Number> ae = new Average<Number>(nb);
		System.out.println(ae.findAverage());
		
		//Average<String> sn = null;
	}

}
