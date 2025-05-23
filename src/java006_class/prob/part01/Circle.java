package java006_class.prob.part01;

public class Circle {
	String name;
	double radius;
	
	double area() {
		return radius*radius*3.14;
	}
	
	void display() {
		System.out.printf("%s의 면적은 %.2f\n",name,area());
	}
}
