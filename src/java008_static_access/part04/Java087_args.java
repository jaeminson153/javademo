package java008_static_access.part04;

// javac -d Java087_args.java
// java -cp . java008_static_access.part04.Java087_args hello

public class Java087_args {

	public static void main(String[] args) {
		
		for(String data : args)
			System.out.println(data);

	}

}
