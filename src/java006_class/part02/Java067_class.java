package java006_class.part02;

public class Java067_class {

	public static void main(String[] args) {
		
		Book bk = new Book();
		Book bs = new Book();
		
		bk.title = "칼의 노래";
		bk.state = false;
		
		bs.title = "어두운 상점의 거리";
		bs.state = true;
		
		bk.display();
		bs.display();

	}

}
