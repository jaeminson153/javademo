package java021_jdbc.part02;

import java.util.List;
import java.util.Scanner;

public class Java223_Jdbc {
	/*
	* MVC패턴
	* Model : 데이터 관리(DTO, DAO)
	* View : 결과화면
	* Controller : 클라이언트 요청과 응답처리, Model과 View 연결
	*
	*/

	public static void main(String[] args) {
		DepartmentsController dController = new DepartmentsController();
		
		List<DepartmentsDTO> aList = null;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("1 전체, 2 검색어, 3.종료 :");
			
			int input = Integer.parseInt(sc.nextLine());
			if(input == 1) {
				aList = dController.listProcess();	
			}else if(input == 2) {
				System.out.print("부서명 입력 :");
				String search = sc.nextLine();
				aList = dController.listSearchProcess(search);
			}else {
				System.out.println("프로그램이 종료되었습니다.");
				break;
			}			
					
			display(aList);
		}
		sc.close();
	}
	
	public static void display(List<DepartmentsDTO> aList) {
		for(DepartmentsDTO dto : aList) {
			System.out.printf("%4d %21s %3d %d\n", dto.getDepartment_id(), dto.getDepartment_name(), dto.getManager_id(), dto.getLocaton_id());
		}
		
	}

}
