package kr.co.quiz;

public class Ex8_4_Order {
//  �ֹ� ��ȣ(orderNumber)    -->  ORD123
//  �ֹ� �ݾ�(orderAmount)    -->  100.5
//  �ֹ� ����(orderStatus)    -->  ó����
//  -> ��, ���� �������� ��� private���� ����
//Order Ŭ������ ��� ������ ���� getter, setter ����
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
			System.out.println("��ȿ���� �ʴ� �ݾ��Դϴ�.");
		} else if(amountCheck >= 100) {
			System.out.println("�ֹ���ȣ:"+oderNumber+" �ֹ��ݾ�:" +oderAmount+" �ֹ�����:"+oderStatus );
		}
	}
	
	
	
	
	
	
	
//	   amountCheck() ȣ�� �޼ҵ� ����
//	�ֹ� �ݾ��� 100 �̸��̸�  " ��ȿ���� ���� �ݾ��Դϴ�." ���
//	�ֹ� �ݾ��� 100 �̻��̸� �ֹ� ��ȣ,�ֹ� �ݾ�, �ֹ� ���¸� ���
	
	
	
	
	
	

}
