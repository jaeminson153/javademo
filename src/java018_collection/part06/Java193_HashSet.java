package java018_collection.part06;

import java.util.HashSet;

public class Java193_HashSet {

	public static void main(String[] args) {
		// HashSet 중복허용 안되고 , 순서유지 안된다.
		HashSet<Integer> set = new HashSet<>();
		set.add(10);
		set.add(20);
		set.add(30);
		System.out.println(set.add(30));
		System.out.println(set.add(40));
		
		for(int it : set)
			System.out.println(it);

	}

}
