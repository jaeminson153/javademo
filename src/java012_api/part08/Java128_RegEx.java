package java012_api.part08;
//Pattern.matcher() : 빠르게 어떠한 text(String)이 주어진 Pattern에
//있는지를 확인한다.
//Pattern.compile(): 여러개의 텍스트를 재사용 가능한 Pattern 
//인스턴스로 컴파일 한다.
//find() : 최초의 패턴 위치로 이동한 뒤 True 반환, 없으면 false 
//find(int start) : start 위치 부터 find 
//start() : 매칭되는 패턴의 시작 인덱스 반환 
//start(int group) : group이 매칭되는 시작 인덱스 반환
//end() : 매칭된 패턴 한칸 뒤 인덱스 반환 
//end(int group) : 지정되 그룹이 매칭되는 한칸 뒤 인덱스 반환 
//group() : 최초로 그룹 매칭된 패턴을 반환 group(int group) : 그룹 매칭된 부분중 group번째 패턴을 반환 
//groupCount() : 패턴내 그룹핑(괄호로 묶은 패턴들)의 갯수 반환
//matches() : 패턴이 전체 문자열과 일치하면 True

public class Java128_RegEx {

	public static void main(String[] args) {
		String sn = "java korea";
		String sg = "";

		// a 또는 r 이면 '_'로 변경
		for (int i = 0; i < sn.length(); i++) {
			char data = sn.charAt(i);
			if (data == 'a' || data == 'r') {
				sg += "_";
			} else {
				sg += data; // sg = sg + data;
			}
		}

		System.out.println(sg);
		
		System.out.println("======== Regular Expression ======= 을 이용한 문자 변경");
		// [] 는 or 를 의미
		// . : 임의의 문자 하나
		// * : 0 개 이상
		
		System.out.println(sn.replaceAll("[ar]", "_"));
		
		// sn변수에 저장된 문자열을 a이거나 r이면 "_"로 변경한다.
		System.out.println(sn.replaceAll("[ar]", "_"));
		System.out.println(sn);

		// sn변수에 저장된 문자열이 a 이거나 r로 끝나면 true를 리턴하고 아니면 false을 리턴한다.
		System.out.println(sn.matches(".*[ar]"));

		// sn변수에 저장된 문자열이 a 이거나 r로 시작하면 true를 리턴하고 아니면 false을 리턴한다.
		System.out.println(sn.matches("[ar].*"));
		
		// sn변수에 저장된 문자열에서 a 이거나 r이 포함되여 있으면 true를 리턴하고 아니면 false을 리턴한다.
		System.out.println(sn.matches(".*[ar].*"));
		System.out.println("======== Regular Expression ======= 2");
		String st = "java@@@@korea@@test@sample";
		String sa = st.replaceAll("@{2,3}", "_");
		System.out.println(sa);
		
		sa = st.replaceAll("@{2}", "_");
		System.out.println(sa);		
		
		sa = st.replaceAll("@{2,}", "_");
		System.out.println(sa);	
				
		String[] line = st.split("@{1,}");
		for(int i = 0 ; i<line.length ; i++) {
			System.out.printf("line[%d]=%s\n",i,line[i]);
		}
		
		String sp = "java    jsp   oracle   mybatis";
		String[] arr = sp.split("\\s{1,}");
		for(int i = 0 ; i<arr.length ; i++) {
			System.out.printf("arr[%d]=%s\n",i,arr[i]);
		}		
		
		
	}

}
