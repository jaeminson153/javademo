package java007_class.part08;

public class Java082_class {

	public static void main(String[] args) {
		int[] num = {10,20,30,40,50};
		
		for(int i = 0 ; i < num.length ; i++) {
			System.out.println(num[i]);
		}
		
		System.out.println("====================");
		
		// 0 번 부터 마지막 까지 하나씩 증가할때만 사용되고 값을 직접가져온다.
		for(int element : num) {
			System.out.println(element);
		}

	}

}
