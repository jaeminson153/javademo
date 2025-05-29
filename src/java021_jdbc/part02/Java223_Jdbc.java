package java021_jdbc.part02;

import java.util.List;

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
		aList = dController.listProcess();
		display(aList);
	}
	
	public static void display(List<DepartmentsDTO> aList) {
		for(DepartmentsDTO dto : aList) {
			System.out.printf("%4d %21s %3d %d\n", dto.getDepartment_id(), dto.getDepartment_name(), dto.getManager_id(), dto.getLocaton_id());
		}
		
	}

}
