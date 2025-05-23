package java017_collection.part04;

import java.util.Vector;

public class Java183_Vector {

	public static void main(String[] args) {
		Person p1 = new Person("홍길동",30);
		Person p2 = new Person("이영희",25);
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		
		
		Person[] ps = new Person[2];		
		ps[0] = new Person("홍길동",30);
		ps[1] = new Person("이영희",25);
		
		for(Person pn : ps)
			System.out.println(pn);		// 오버라이딩한 toStirng() 이 호출된다.
		
		
		Vector<Person> vt = new Vector<Person>();
		vt.add(new Person("홍길동",30) );
		vt.add(new Person("이영희",25) );
		
		for(Person pn : vt)
			System.out.println(pn);
				

	}

}
