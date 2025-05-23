package java010_abstract_interface.prob.part03;

public class Whale extends Fish implements Mammal {

	public Whale() {
		super("고래");
	}

	@Override
	public void bear() {
		System.out.printf("%s는 새끼를 낳습니다.",name);		
	}
	
}
