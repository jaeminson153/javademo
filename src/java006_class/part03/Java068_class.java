package java006_class.part03;

public class Java068_class {

	public static void main(String[] args) {
		
		Rect rt = new Rect();
		Rect rc = new Rect();
		
		rt.width = 5;
		rt.height = 3;
		rt.color = "파랑";
		
		rt.display();

		rc.width = 7;
		rc.height = 4;
		rc.color = "노랑";
		
		rc.display();		
		
	}

}
