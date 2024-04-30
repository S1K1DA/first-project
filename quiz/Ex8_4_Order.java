package kr.co.quiz;

public class Ex8_4_Order {
//  주문 번호(orderNumber)    -->  ORD123
//  주문 금액(orderAmount)    -->  100.5
//  주문 상태(orderStatus)    -->  처리중
//  -> 단, 위의 변수들은 모두 private으로 생성
//Order 클래스에 모든 변수에 대한 getter, setter 생성
	private String oderNumber;
	private double oderAmount;
	private String oderStatus;
	private int amountCheck;
	
	public Ex8_4_Order() {
//		
	}
	public Ex8_4_Order(String oderNumber, double oderAmount, String oderStatus) {
		this.oderNumber = oderNumber;
		this.oderAmount = oderAmount;
		this.oderStatus = oderStatus;
	}
	
	// getter
	public String getOderNumber() { 
		return oderNumber;
	}
	public double getOderAmount() { 
		return oderAmount;
	}
	public String getOderStatus() { 
		return oderStatus;
	}
	
	//setter
	
	public void setOderNumber(String oderNumber) {
		this.oderNumber = oderNumber;
	}
	public void setOderAmount(double oderAmount) {
		this.oderAmount = oderAmount;
	}
	public void setOderStatus(String oderStatus) {
		this.oderStatus = oderStatus;
	}
	
	public void amountCheck(int amountCheck) {
		if(amountCheck < 100) {
			System.out.println("유효하지 않는 금액입니다.");
		} else if(amountCheck >= 100) {
			System.out.println("주문번호:"+oderNumber+" 주문금액:" +oderAmount+" 주문상태:"+oderStatus );
		}
	}
	
	
	
	
	
	
	
//	   amountCheck() 호출 메소드 생성
//	주문 금액이 100 미만이면  " 유효하지 않은 금액입니다." 출력
//	주문 금액이 100 이상이면 주문 번호,주문 금액, 주문 상태를 출력
	
	
	
	
	
	

}
