package java009_inheritance.prob.part02;

public class StudentExam extends Human{
	String studentNo;
	
	public StudentExam() {
	
	}
	
	public StudentExam(String name, int age, int height, int weight, String studentNo) {
		super(name, age, height, weight);
		this.studentNo = studentNo;
	}	
	
	@Override
	public String toString() {
		String data = name + "\t" + age + "\t  " + height + "\t   " + weight + "\t   " + studentNo;
		return data;
	}	
}
