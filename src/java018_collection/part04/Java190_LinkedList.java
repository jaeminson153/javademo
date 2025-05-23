package java018_collection.part04;

import java.util.LinkedList;

public class Java190_LinkedList {
//  Queue(큐)
//  1. FIFO (First In First Out) : 제일 먼저 저장한 요소를 먼저 꺼내온다.
//  2. 최근 사용문서, 인쇄작업대기목록, 버퍼

	public static void main(String[] args) {
		LinkedList<String> nQueue = new LinkedList<String>();
		nQueue.offer("java");
		nQueue.offer("jsp");
		nQueue.offer("spring");
		
//		System.out.println(nQueue.size());
//		System.out.println(nQueue.poll());
//		System.out.println(nQueue.poll());
//		System.out.println(nQueue.poll());
//		System.out.println(nQueue.size());
//		// 더이상 없으면 null 로 가져온다.
//		System.out.println(nQueue.poll());
		
		while(!nQueue.isEmpty())
			System.out.println(nQueue.poll());
		
		System.out.println(nQueue.size());
	}

}
