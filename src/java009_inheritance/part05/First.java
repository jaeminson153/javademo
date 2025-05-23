package java009_inheritance.part05;

import java.lang.Override;


public class First {
	int a = 10;
	
	public First() {
	
	}
	
	protected void display() {
		System.out.println("a="+ a);
	}
	
	@Override
	public String toString() {

		return String.format("a=%d", a);
	}
	
}
