package java910_test.part01;
import java.io.IOException;
import java.util.Scanner;

public class Java910_test {
	
	public static void main(String[] args) {
		printMain();
		Scanner scanner = new Scanner(System.in);
		while(true) {		
			printMenu();
				
		    
	
		    // 문자열 입력 받기
		    System.out.print("메뉴번호를 입력하세요: ");
		    String menuNo = scanner.nextLine();	
		    
		    
		    if(menuNo.equals("1")) {
		    	System.out.print("메뉴 : "+ menuNo);
		    	break;
		    }else if(menuNo.equals("2")) {
		    	System.out.print("메뉴 : "+ menuNo);
		    	break;
		    }else if(menuNo.equals("3")) {
		    	System.out.print("메뉴 : "+ menuNo);
		    	break;
		    }else {
		    	System.out.println("메뉴를 다시 선택해 주세요.");
		    	System.out.println("아무키나 눌러주세요.");
		    		    	
				clearConsole();
						    
			    				
		    }		    
	        
		}
		scanner.close();
		System.out.println("======================");
        
	}
	
	public static void printMain() {
		System.out.println("┌───────────────────────────────────────┐");
		System.out.println("│           ♥ 구디역 맛집 관리  ♥		│");
		System.out.println("└───────────────────────────────────────┘");		
	}
	
	public static void printMenu() {
		System.out.println("┌───────────────────────────────────────┐");
		System.out.println("│ 1. 맛집입력   2. 맛집리스트  3. 저장 	│");
		System.out.println("└───────────────────────────────────────┘");		
	}	
	
	public static void clearConsole() {	    
        // ANSI escape code to clear screen
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
	}	
	
}
