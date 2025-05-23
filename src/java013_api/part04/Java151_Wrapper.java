package java013_api.part04;

public class Java151_Wrapper {

	public static void main(String[] args) {
		char data = 'a';
		
		if(data >= 'a' && data <= 'z')
			System.out.println((char)(data-32));
		
		System.out.println(Character.isLowerCase(data));	// 소문자
		System.out.println(Character.toUpperCase(data));	// 대문자로 변경
		System.out.println(Character.isUpperCase(data));	// 대문자?
		System.out.println(Character.toLowerCase(data));	// 소문자로 변경
		System.out.println(Character.isDigit(data));
		System.out.println(Character.isAlphabetic(data));
	}

}
