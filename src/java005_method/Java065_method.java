package java005_method;

public class Java065_method {

	public static void main(String[] args) {
		char[] data = {'a','b','c','d'};
		
		for(int i = 0 ; i < data.length; i++) {
			System.out.printf("%c",data[i]);
		}
		
		System.out.println(data);
		System.out.print(data+"\n");
		System.out.printf("%s\n",data);
		
		int[] num = {1,2,3};
		int[] num1 = {1,2,3};
		System.out.println(num);
		System.out.println(num1);

	}

}
