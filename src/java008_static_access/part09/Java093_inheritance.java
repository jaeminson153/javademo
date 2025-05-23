package java008_static_access.part09;

public class Java093_inheritance {

	public static void main(String[] args) {
		
		// has a ~ : 포함관계
		Father father = new Father();
		Child child = new Child();
		
		System.out.println(child.a);
		
		child.display();
		

	}

}
