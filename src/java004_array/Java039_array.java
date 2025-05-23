package java004_array;

public class Java039_array {

	public static void main(String[] args) {
		
		// 기본타입은 스택에 저장된다.
		// 모든 참조 변수는 스택영역에 4byte 가 잡힌다. 실제공간은 힙에 잡힌다.
		int[] arr = new int[3];  // 배열명은 스택에,  배열공간은 힙에 생성됨.
		
		arr[0] = 90;
		arr[1] = 80;
		arr[2] = 40;
		
		System.out.printf("arr[0]=%d\n",arr[0]);
		System.out.printf("arr[1]=%d\n",arr[1]);
		System.out.printf("arr[2]=%d\n",arr[2]);
		
		System.out.println("배열의 크기:"+ arr.length);
		
		for(int i = 0; i < arr.length ; i++) {
			System.out.printf("arr[%d]=%d\n",i,arr[i]);
		}		
		
	}// end main()

}// end class
