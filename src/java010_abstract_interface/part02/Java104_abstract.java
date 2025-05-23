package java010_abstract_interface.part02;

public class Java104_abstract {

	public static void main(String[] args) {
		Rect rect = new Rect(10,20);
		System.out.println("사각형의 면적:"+rect.getArea());
		
		Tri tri = new Tri(13,11);
		System.out.println("사각형의 면적:"+ tri.getArea());		

	}

}
