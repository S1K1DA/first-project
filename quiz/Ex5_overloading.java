package kr.co.quiz;

public class Ex5_overloading {

	public static void main(String[] args) {
		
		Ex5_overloading add = new Ex5_overloading();
		
		add.add(0, 1);
		add.add(0.5, 8);
		add.add(5, 0.8);
		add.add(1, 0.7, 5);
		add.add(0.7, 4, 0.6);
		

	}

	// add �޼ҵ� 5�� ����
	// ex) 10+10, 10+5.5, 5.5+10, 101+2+3.3,
	// ���޹��� �Ű������� ���ϰ� ����ϴ� �޼ҵ� �ۼ�
	
	public void add(int num,int num1) {
		System.out.println("1�� �޼ҵ� : " + (num + num1));
	}
	public void add(int num, double num1) {
		System.out.println("2�� �޼ҵ� : " + (num + num1));
	}
	public void add(double num, int num1) {
		System.out.println("3�� �޼ҵ� : " + (num + num1));
	}
	public void add(double num, int num1, double num2) {
		System.out.println("4�� �޼ҵ� : " + (num + num1 + num2));
	}
	public void add(int num, double num1, int num2) {
		System.out.println("5�� �޼ҵ� : " + (num + num1 + num2));
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
