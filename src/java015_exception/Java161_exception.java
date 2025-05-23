package java015_exception;

public class Java161_exception {

	public static void main(String[] args) {
		StringBuffer sBuffer = null;
		
		try {
			sBuffer.reverse();
		}catch(Exception e){
			sBuffer = new StringBuffer("java");
			sBuffer.reverse();						
		}finally {
			System.out.println(sBuffer);
		}		

	}

}
