package java006_class.part08;

public class Java073_this {

	public static void main(String[] args) {
		Employees emp = new Employees("김사부","영업부",5000);
		System.out.println(emp.toString());
		
		Employees emp2 = new Employees("김민재");
		System.out.println(emp2.toString());

	}

}
