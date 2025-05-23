package java010_abstract_interface.part04;

public interface CarRun {
	int carCount = 5; // public static final

	// 생성자롸 static{} 가질수 없다.
	
	void prn();		// public abstract 
	
	class Sun{
		public Sun() {
			System.out.println("Sun constructor");
		}
	}
	
	// java 8 버전부터
	default void call() {
		System.out.println("CarRun call");
	}
	
	// java 8 버전부터
	static void display() {
		System.out.println("display");
	}
}
