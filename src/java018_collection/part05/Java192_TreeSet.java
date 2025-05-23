package java018_collection.part05;

import java.util.Iterator;
import java.util.TreeSet;

public class Java192_TreeSet {

	public static void main(String[] args) {
		//Tree (오름차순 정렬), Set (중복안됨)   순서유지 않되고 중복안되고 하지만 tree 이면 오름차순
		TreeSet<Integer> tree = new TreeSet<Integer>();
		tree.add(300);
		tree.add(100);
		tree.add(200);
		System.out.println(tree.size());
		
		for(int it : tree)
			System.out.println(it);
		
		System.out.println("======Iterator============");
		Iterator<Integer> ita = tree.iterator();
		while(ita.hasNext())
			System.out.println(ita.next());
		
		System.out.println("======내림차순============");
		Iterator<Integer> descIta = tree.descendingIterator();
		while(descIta.hasNext())
			System.out.println(descIta.next());
		
		System.out.println("=========================");
		
		System.out.println(tree.size());
		System.out.println(tree.first());
		System.out.println(tree.size());
		
		System.out.println(tree.pollFirst());	// Remove 하며 가져옴.
		System.out.println(tree.size());
		
		System.out.println(tree.last());
		System.out.println(tree.size());
		
		System.out.println(tree.pollLast());
		System.out.println(tree.size());
	}

}
