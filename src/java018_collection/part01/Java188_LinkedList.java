package java018_collection.part01;

import java.util.LinkedList;

public class Java188_LinkedList {
//  1. 배열 구조로 데이터 관리 : Vector, ArrayList
//  => 추가 - 순차적으로 처리할 때 사용
//2. 연결리스트로 데이터 관리 : LinkedList
//  => 삽입, 삭제 -비순차적으로 처리할 때 사용
//3. List을 구현해놓은 컬렉션
//Vector, ArrayList, LinkedList은 add() 해준 순서대로 데이터 관리를 해준다.

	public static void main(String[] args) {
		LinkedList<String> aList = new LinkedList<String>();
		
		aList.add("java");
		aList.add("jsp");
		aList.add("spring");
		for(String data: aList)
			System.out.println(data);
		System.out.println("===========");
		aList.add(1, "Mysql");
		for(String data: aList)
			System.out.println(data);

	}

}
