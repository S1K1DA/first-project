package kr.co.green;

public class Ex5_method {

	public static void main(String[] args) {
		
		// class : Ʋ
		// �޼ҵ� : ����� �����ϴ� �ڵ� ����
		
		
		
		
		// ��ü ����(=�ν��Ͻ�ȭ)
		// Ex5_method Ŭ������ �޸𸮿� �ø��� ����
		
		// �޼ҵ带 ���� Ŭ������ ������ ��ü�� ������ ��
		// Ŭ������ ������ = new Ŭ������();
		Ex5_method m = new Ex5_method();
		
		// ������.�޼ҵ��();
		String printStr = "Hello, Method!";
		m.print(printStr); // "Hello, Method!"
		
		int resultAdd = m.add(1, 2);		
		System.out.println("add : " + resultAdd);
		
		
		m.sub(20, 10);
		
		
		
		// ���� Ŭ����(Ex5_1_calc)�� ��ü ����
		Ex5_1_calc calc = new Ex5_1_calc();
		
		int resultAdd2 = calc.add(100,50); // 100+50
		calc.div(777,5); // 777-5
		calc.sub(200,150); // 200 *150
		String resultmul2 = calc.mul(1000,23); // 1000/23
		
		// ���� Ŭ���� ��ü ����
		Ex5_2_animal animal = new Ex5_2_animal();
		String ani1 = "�Դ���";
		String ani2 = "�ڴ���";
		String ani3 = "������ �Ҹ��� ���ϴ�.";                                                       
		
		
		// eat�޼ҵ�� 1�� ��ȯ
//		animal.eat(); //"�Դ���"�̶�� ���ڿ��� ����
		//��ȯ ���� �� ���
	    int resultEat = animal.eat(ani1);
		System.out.println(resultEat);
		
		//sleep �޼ҵ�� 2�� ��ȯ
//		animal.sleep(); //"�ڴ���"�̶�� ���ڿ��� ����
		//��ȯ ���� �� ���
		int resultSleep = animal.sleep(ani2);
		System.out.println(resultSleep);
		
		//makeSound �޼ҵ�� 3�� ��ȯ
//		animal.makeSound(); //"������ �Ҹ��� ���ϴ�."�̶�� ���ڿ��� ����
		//��ȯ ���� �� ���
		int resultSound = animal.makeSound(ani3);
		System.out.println(resultSound);
	}
		

	// �E���� �����ϴ� �޼ҵ�
	public void sub(int num1,int num2) {
		System.out.println(num1);
		
		System.out.println(num2);
		
		System.out.println("���� ��� : " + (num1-num2));
	}
		
	public void print(String printStr) {
		System.out.println("Hello, Method!");
	}
		
//	public void add(int add1,int add2) {
		public int add(int add1,int add2) {
		// System.out.println(add1+add2);
		return add1+add2;
	}
		
		
		
		
		
		
		
		
		
	

}
