package kr.co.quiz;

public class Ex5_3_Buy {
	
	public int balance = 100000;
	public int MonitorPrice = 20000;
	public int MousePrice = 18000;
	public int DesktopPrice = 70000;
	
	// buyMonitor
	
	public void buyMontior() {
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
	

	
	
	
	
	
}
