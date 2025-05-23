package java017_collection.part09;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

// Enumeration 은 Vector 와 Hashtable 에서만 제공이 되는 인터페이스이다. 
public class Java187_ArrayList {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>();
		v.add(10);
		v.add(20);
		v.add(30);
		
		System.out.println("=========== 일반 for =============");
		for(int i = 0 ; i < v.size(); i++)
			System.out.println(v.get(i));
		
		System.out.println("=========== Enumeration  =============");
		// 열거형 jdk 1.0 부터  
		Enumeration<Integer> enu = v.elements();	// Vector 만 지원된다.
		while(enu.hasMoreElements())
			System.out.println(enu.nextElement());
		
		System.out.println("=========== Iterator  =============");   /////////// 개선된 루프를 더 많이 사용한다.
		// 반복자 v1.2 부터 추가 
		Iterator<Integer> ite = v.iterator();
		while(ite.hasNext())
			System.out.println(ite.next());
		
		System.out.println("=========== 개선된 루프  =============");
		for(Integer ig : v)
			System.out.println(ig);
		
	}

}
