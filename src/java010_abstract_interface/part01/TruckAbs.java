package java010_abstract_interface.part01;

public class TruckAbs  extends CarAbs{
	
	public TruckAbs() {
	
	}

	@Override
	public void work() {
		System.out.println("트럭의 역활은 짐을 운반하는 것이다");		
	}
	
//	public void work() {
//		System.out.println("이 트럭의 역활은 짐을 운반하는 것이다");
//	}	
	
}
