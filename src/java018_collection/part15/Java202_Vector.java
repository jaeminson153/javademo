package java018_collection.part15;

import java.util.Vector;

public class Java202_Vector {

	public static void main(String[] args) {
		Vector<String> vt = new Vector<String>();
		
		vt.add("java");
		vt.add("jsp");
		vt.add("spring");
		vt.add("oracle");
		vt.add("mysql");
		System.out.println(vt.toString());
		
		vt.remove(0);
		System.out.println(vt.toString());
		
		System.out.println("===========================");
		Vector<String> vm = new Vector<String>();
		vm.add("oracle");
		vm.add("mysql");
		vm.add("mssql");		
		
		vt.removeAll(vm);
		System.out.println(vt.toString());
		
		System.out.println("===========================");
		Vector<Integer> vn = new Vector<>();
		vn.add(10);
		vn.add(20);
		vt.removeAll(vn);
		System.out.println(vt.toString());
		
	}

}
