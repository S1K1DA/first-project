package kr.co.quiz;

public class Ex8_2_Buy {
	
	public int balance;
	public int MonitorPrice;
	public int MousePrice;
	public int DesktopPrice;
	
	// �⺻ ������
	public Ex8_2_Buy() {
//		this(100000, 20000, 50000, 30000);    // �ڵ带 ����ϰ� �ϰ� �ߺ��� �ٿ��� //������ ù��
		
//		this.balance = 100000;
//		this.MonitorPrice = 20000;
//		this.MousePrice = 15000;
//		this.DesktopPrice = 100000;     // �䷸�� �����ϰ� �ڵ��ۼ��� �ʿ����.
	}
	
	
	
	// �Ű����� �ִ� ������(balance, monitorPrice, MousePrice, DesktopPrice)
	public Ex8_2_Buy(int balance,int MonitorPrice, int MousePrice, int DesktopPrice ) {
		this.balance = balance;
		this.MonitorPrice = MonitorPrice;
		this.MousePrice = MousePrice;
		this.DesktopPrice = DesktopPrice;
	} 
	
	public void buyMonitor() {
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
	
	

	                                                                                                          
	
//	balance = balance-MonitorPrice;
//	System.out.println("����͸� �����ϼ̽��ϴ�. ���� �ݾ��� " + balance + "�� �Դϴ�.");
//	
//	balance = balance-MousePrice;
//	System.out.println("���콺�� �����ϼ̽��ϴ�. ���� �ݾ��� " + balance + "�� �Դϴ�.");
//	
//	balance = balance-DesktopPrice;
//	System.out.println("����ũž�� �����ϼ̽��ϴ�.���� �ݾ��� " + balance + "�� �Դϴ�.");

}
