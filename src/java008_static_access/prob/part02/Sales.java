package java008_static_access.prob.part02;
//-(private)    + (public)    #(protected)     X : default

/*   클래스명 : Sales
*   -item:String  
*   -qty:int
*   -cost:int
*   
*   +setItem(item :String):void
*   +setQty(qty :int):void
*   +setCost(cost :int):void
*   +getItem():String
*   +getQty():int
*   +getCost():int
*   +toString():String         ==> 출력
*   +getPrice():int             ==> 수량 * 단가를 리턴
*/

public class Sales {
	private String item;
	private int qty;
	private int cost;
	
	public Sales() {
	
	}
	
	public String toString() {
		return String.format("품목 : %s 수량 : %d 단가 : %d원 금액 %d원\n",item,qty,cost,qty*cost);
	}
	
	public int getPrice() {
		return cost*qty;
	}
	
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	
}
