package java018_collection.part10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Java197_User {
	public static void main(String[] args) {
		Box<String> strBox = new Box<>("java");
		System.out.println(strBox.getData());
		
		Box<Integer> iBox = new Box<>(10);
		System.out.println(iBox.getData());
		
		Box<Double> dblBox = new Box<>();
		dblBox.setData(4.5);
		System.out.println(dblBox.getData());
	}
}
