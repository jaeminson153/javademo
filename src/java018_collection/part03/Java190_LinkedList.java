package java018_collection.part03;

import java.util.LinkedList;

public class Java190_LinkedList {
//  stack(스택)
//  1. LIFO(Last In First Out) : 마지막에 저장된 요소를 먼저 꺼낸다.
//  2. 수식계산, 수식괄호검사, undo/redo, 뒤로/앞으로
	
	public static void main(String[] args) {
		LinkedList<String> nStack = new LinkedList<String>();
		nStack.push("java");
		nStack.push("jsp");
		nStack.push("spring");
		
		System.out.println(nStack.get(0));	// 역순으로 
		System.out.println(nStack.size());
		
//		System.out.println(nStack.pop());
//		System.out.println(nStack.pop());
//		System.out.println(nStack.pop());
		
		while(!nStack.isEmpty())
			System.out.println(nStack.pop());
		
		System.out.println(nStack.size());

	}

}
