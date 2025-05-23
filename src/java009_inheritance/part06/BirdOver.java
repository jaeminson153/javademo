package java009_inheritance.part06;

public class BirdOver extends PetOver {
	public BirdOver() {
	
	}
	
	@Override
	public void move() {
		System.out.println("서브 클래스 move() : 새가 날아갑니다.");
	}	
	
	
}
