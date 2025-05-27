package ncs.test13;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Inventory {
	private String productName;   	//상품명 
	private Date putDate;          	//입고일
	private Date getDate;			//출고일 
	private int putAmount;         	//입고수량
	private int getAmount;         	//출고수량
	private int inventoryAmount;  	//재고수량
	
	public Inventory() {
	
	}
	
	public Inventory(String productName, String putDate, int putAmount) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.mm.dd");
		Date date;
		try {
			date = sdf.parse(putDate);
			this.productName = productName;
			this.putDate = date;
			this.putAmount = putAmount;		
			this.getAmount = 0;
			this.getDate = null;
			this.inventoryAmount = putAmount;
			
		} catch (ParseException e) {
			e.printStackTrace();
		}		

	}

	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 mm월 dd일");
		
		return String.format("%-12s\t,%13s 입고, %d개, %s, %d개, 재고 %d개", productName, putDate != null ? sdf.format(putDate) : "null", putAmount, getDate != null ? sdf.format(getDate) : "null",  getAmount, inventoryAmount);
		//return String.format("%12s, %s 입고, %d개",productName,sdf.format(putDate), putAmount);
	}
	
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Date getPutDate() {
		return putDate;
	}

	public void setPutDate(Date putDate) {
		this.putDate = putDate;
	}

	public Date getGetDate() {
		return getDate;
	}

	public void setGetDate(Date getDate) {
		this.getDate = getDate;
	}

	public int getPutAmount() {
		return putAmount;
	}

	public void setPutAmount(int putAmount) {
		this.putAmount = putAmount;
		this.inventoryAmount = this.putAmount - this.getAmount;
	}

	public int getGetAmount() {
		return getAmount;
	}

	public void setGetAmount(int getAmount) throws AmountNotEnough {
		this.getAmount = getAmount;
		if(this.putAmount - this.getAmount < 0 ) 			
			throw new AmountNotEnough("현재 재고가 부족합니다. 재고수량 확인하시기 바랍니다.");
		else
			this.inventoryAmount = this.putAmount - this.getAmount;
	}

	public int getInventoryAmount() {
		return inventoryAmount;
	}

	public void setInventoryAmount(int inventoryAmount) {
		this.inventoryAmount = inventoryAmount;
	}
	
	
}
