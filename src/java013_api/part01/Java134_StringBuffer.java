package java013_api.part01;

public class Java134_StringBuffer {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("java test");
		System.out.println(sb);
		System.out.println(sb.toString());
		
		sb.insert(4, "jsp");
		System.out.println(sb);
		
		sb.delete(4, 7);
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
		// String => StringBuffer => String
		String data = "mybatis orm";
		System.out.println(data);
		StringBuffer sf = new StringBuffer(data);
		sf.reverse();
		data = sf.toString();
		System.out.println(data);
		
		//char[] = StringBuffer
		char[] arr = {'k','o','r','e','a'};
		StringBuffer sk = new StringBuffer(new String(arr));
		//ssf.append(arr);
		System.out.println(sk.reverse());
		
		StringBuffer se = new StringBuffer(String.valueOf(arr));
		System.out.println(se.reverse());		
		System.out.println(arr);
		
		// StringBuffer => String => char[]
		String sp = se.toString();
		char[] val = sp.toCharArray();
		System.out.println(val);
		System.out.println(se.toString().toCharArray());
		
		
	}

}
