package java012_api.part06;

public class Java122_String {

	public static void main(String[] args) {
		String sn = "127.0.0.1:8080";
		
		String[] data = sn.split(":");
		System.out.printf("ip:%s\n",data[0]);
		System.out.printf("port:%s\n",data[1]);

	}

}
