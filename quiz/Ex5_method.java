package kr.co.quiz;

public class Ex5_method {

	public static void main(String[] args) {

		
		// Ŭ���� ���� : Ex_1_car
		// startEngine() : "�ڵ��� ������ �����մϴ�." ���
		// stopEngine() : "�ڵ��� ������ �����մϴ�." ���
		// accelerate() : "�ڵ��� �����մϴ�." ���
		// brake() : "�ڵ����� �����մϴ�." ���
		
		// ��ü ���� �� 4�� �޼ҵ� ȣ��
		
		
		Ex5_1_car car = new Ex5_1_car();
		
		car.startEngine();
		car.stopEngine();
		car.accelerate();
		car.brake();
		
		
		// ��ü ����(Ex5_2_minMax)
		Ex5_2_minMax minMax = new Ex5_2_minMax();
		
		int[] numbers = {10, 23, 64, 7, 99};
		
		// �ּڰ� ���ϴ� �޼ҵ� ȣ��(numbers)
		// ��ȯ���� �ּڰ��� ���� minValue�� ���� �� ���
		int minValue = minMax.min(numbers);
		System.out.println("�ּڰ� : " + minValue);
		
		// �ִ� ���ϴ� �޼ҵ� ȣ��(numbers)
		// ��ȯ���� �ִ밪�� ���� maxValue�� ���� �� ���
		int maxValue = minMax.max(numbers);
		System.out.println("�ִ밪 : " + maxValue);
		
		minMax.getMin(10, 20, 30, 40);
		
		
		
		
		
		 
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
