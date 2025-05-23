package java004_array;

public class Java053_array {

	public static void main(String[] args) {
		
		char[][] color = { { 'r', 'e', 'd' }, 
		           { 'g', 'r', 'e', 'e', 'n' }, 
		           { 'p', 'i', 'n', 'k' } };
		
		for (int row = 0; row < color.length; row++) {
			for (int col = 0; col < color[row].length; col++) {
				if(col == 0)
					System.out.printf("%c", color[row][col]-32);
				else
					System.out.printf("%c", color[row][col]);
			}
			System.out.println();
		}		

	}

}
