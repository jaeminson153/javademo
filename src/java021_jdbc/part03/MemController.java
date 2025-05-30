package java021_jdbc.part03;

import java.util.HashMap;
import java.util.List;

public class MemController {

	private MemService service;
	
	public MemController() {
		service = new MemService();
	}
	
	public List<MemDTO> listExecute(){
		return service.getListProcess();
	}
	
	public int insertExecute(MemDTO dto){
		return service.getInsertProcess(dto);
	}	
	
//	public int updateExecute(MemDTO dto){
//		return service.getUpdateProcess(dto);
//	}		
	
	public int updateExecute(HashMap dto){
		return service.getUpdateProcess(dto);
	}		
	
	public int deleteExecute(int num){
		return service.getDeleteProcess(num);
	}		
	
	
}
