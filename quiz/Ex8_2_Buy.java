package kr.co.quiz;

public class Ex8_2_Buy {
	
	public int balance;
	public int MonitorPrice;
	public int MousePrice;
	public int DesktopPrice;
	
	// 기본 생성자
	public Ex8_2_Buy() {
//		this(100000, 20000, 50000, 30000);    // 코드를 깔끔하게 하고 중복을 줄여줌 //무조건 첫줄
		
//		this.balance = 100000;
//		this.MonitorPrice = 20000;
//		this.MousePrice = 15000;
//		this.DesktopPrice = 100000;     // 요렇게 복잡하게 코드작성할 필요없음.
	}
	
	
	
	// 매개변수 있는 생성자(balance, monitorPrice, MousePrice, DesktopPrice)
	public Ex8_2_Buy(int balance,int MonitorPrice, int MousePrice, int DesktopPrice ) {
		this.balance = balance;
		this.MonitorPrice = MonitorPrice;
		this.MousePrice = MousePrice;
		this.DesktopPrice = DesktopPrice;
	} 
	
	public void buyMonitor() {
		balance = balance-MonitorPrice;
		System.out.println("모니터를 구입하셨습니다. 남은 금액은 " + balance + "원 입니다.");
	} 
	// buyMouse
	public void buyMouse() {
		balance = balance-MousePrice;
		System.out.println("마우스를 구입하셨습니다. 남은 금액은 " + balance + "원 입니다.");
	} 
	
	// buyDesktop
	public void buyDesktop() {
		balance = balance-DesktopPrice;
		System.out.println("데스크탑을 구입하셨습니다.남은 금액은 " + balance + "원 입니다.");
	} 
	
	

	                                                                                                          
	
//	balance = balance-MonitorPrice;
//	System.out.println("모니터를 구입하셨습니다. 남은 금액은 " + balance + "원 입니다.");
//	
//	balance = balance-MousePrice;
//	System.out.println("마우스를 구입하셨습니다. 남은 금액은 " + balance + "원 입니다.");
//	
//	balance = balance-DesktopPrice;
//	System.out.println("데스크탑을 구입하셨습니다.남은 금액은 " + balance + "원 입니다.");

}
