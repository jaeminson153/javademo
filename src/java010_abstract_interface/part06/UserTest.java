package java010_abstract_interface.part06;

public class UserTest extends User implements Score, Print{

	private int score;
	
	public UserTest() {
		
	}
	
	public UserTest(String name, int score) {
		super(name);
		this.score = score;
	}	
		
	
	@Override
	public String toPaint() {		
		return String.format("이름 : %s\n점수 : %d", toString(), getScore());
	}

	@Override
	public int getScore() {		
		return sol *score;
	}
	
}
