package kr.co.quiz;

public class Ex5_3_Buy {
	
	public int balance = 100000;
	public int MonitorPrice = 20000;
	public int MousePrice = 18000;
	public int DesktopPrice = 70000;
	
	// buyMonitor
	
	public void buyMontior() {
		balance = balance-MonitorPrice;
		System.out.println("����͸� �����ϼ̽��ϴ�. ���� �ݾ��� " + balance + "�� �Դϴ�.");
	} 
	// buyMouse
	public void buyMouse() {
		balance = balance-MousePrice;
		System.out.println("���콺�� �����ϼ̽��ϴ�. ���� �ݾ��� " + balance + "�� �Դϴ�.");
	} 
	
	// buyDesktop
	public void buyDesktop() {
		balance = balance-DesktopPrice;
		System.out.println("����ũž�� �����ϼ̽��ϴ�.���� �ݾ��� " + balance + "�� �Դϴ�.");
	} 
	

	
	
	
	
	
}
