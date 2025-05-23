package java012_api.part06;

public class Java121_String {

	public static void main(String[] args) {
		String str = new String("KoREa,jsp,java");
		
		System.out.println("문자열 길이:" + str.length());
		System.out.println("대문자:" + str.toUpperCase());
		System.out.println("소문자:" + str.toLowerCase());
		System.out.println("문자:" + str.charAt(0));
		System.out.println("문자:" + str.charAt(5));
		System.out.println("인덱스:" + str.indexOf('a'));
		System.out.println("인덱스:" + str.indexOf(97));
		System.out.println("인덱스:" + str.indexOf('a',5));
		System.out.println("인덱스:" + str.indexOf(97,5));
		System.out.println("인덱스:" + str.indexOf("jsp",0));
		System.out.println("인덱스:" + str.indexOf("jsp",7));
		System.out.println("범위:" + str.substring(5));
		System.out.println("범위:" + str.substring(2,8));
		
		// 메모리에 저장된 문자열을 "," 로 구분해서 문자열 배열로 리턴  : 정규표현식으로
		String[] arr = str.split(",");
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.printf("arr[%d]=%s\n", i, arr[i]);
		}
		
		int x = 10;
		int y = 20;
		
		System.out.printf("x=%d, y=%d, x+y=%d\n",x,y,x+y);
		String s1 = String.valueOf(x);
		String s2 = String.valueOf(y);
		System.out.printf("s1+s2=%s\n", s1+s2);
		
		char[] data = {'1','2','3','4','5'};
		String s3 = String.valueOf(data,1,4);
		System.out.printf("s3=%s\n",s3);
		
		
	}

}
