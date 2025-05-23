package java010_abstract_interface.prob.part04;

public class Staff extends Person {

	public Staff(String name, String jumin) {
		super(name, jumin);
	}

	@Override
	public char gender() {
		// 주민번호를 이용해서 성별을 구한후 반환하는 로직을 구현하세요.
		//String jumin="890426-1056214";
		//char data=jumin.charAt(0);
		char data = jumin.charAt(6);
		char gender = '중';
		if(data == '1' || data == '3')
			gender = '남';
		else 
			gender = '여';
		
		return gender;
	}

	@Override
	public int getYear() {
		// 주민번호를 이용한 년도4자리를 구한후 반환하는 로직을 구현하세요.
		//String jumin="890426-1056214";
		String year = jumin.substring(0,2); //=>"89"
		//1,2 => 19+year   3,4=>20+year
		int num = 0;
		if(jumin.charAt(6)=='1' || jumin.charAt(6)=='2')
			num=Integer.parseInt("19"+year);
		else
			num=Integer.parseInt("20"+year);
		
		return num;
	}

	@Override
	public int getMonth() {		
		return Integer.parseInt(getJumin().substring(2,4));
	}
  
	@Override
	public int getDATE() {		
		return Integer.parseInt(getJumin().substring(4,6));
	}

}// end Staff






