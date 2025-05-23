package java012_api.part06;

// korea
// aerok
// korea
public class Java123_String {

	public static void main(String[] args) {
		String sn = "korea";
		char[] data = reverse(sn);
		System.out.println(sn);
		System.out.println(data);
		System.out.println(sn);		 

	}
	
	public static char[] reverse(String alps) {
		char[] tmp = new char[alps.length()];
		
		for(int i = 0 ; i < tmp.length ; i++) {
			tmp[tmp.length-1-i] = alps.charAt(i);
		}		
		
		return tmp;
	}

}
