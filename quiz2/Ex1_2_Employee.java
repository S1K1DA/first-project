package kr.co.quiz2;

public class Ex1_2_Employee {
	
	private String name;   // �̸�
	private String position;    // ����
	private double salart;    // ����
//	private double percentage;    // ���� �λ� �ݾ�
	
	
	public Ex1_2_Employee(String name, String position, double salart) {
		this.name = name;
		this.position = position;
		this.salart = salart;
	}
	
	public void raiseSalary(double percentage) {  // ���� �λ� �޼���
//		this.percentage = percentage;
		salart = salart + percentage;
		System.out.println(name+" ���� ������ " + percentage + "�ö����ϴ�.");
	}
	
	public void displayEmployeeInfo() {
		System.out.println("���� �̸� : " + name);
		System.out.println("���� ���� : " + position);
		System.out.println("���� ���� : " + salart);
	}

}
