package java003_statements;

public class Java035_for {

	public static void main(String[] args) {
		
		go:  // label
		for(int i = 1; i<=3; i++) {
			for(int j = 1; j<=3; j++) {
				System.out.printf("%3d",j);
				if(j==3) {					
					//break go;
					continue go;	
				}	
			}
		}				

	}

}
