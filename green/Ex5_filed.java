package kr.co.green;

public class Ex5_filed {
	// ��� ����
	int num = 10; //�ν��Ͻ� ����
	static int classNum = 100; // Ŭ���� ����

	public static void main(String[] args) {
		Ex5_filed f = new Ex5_filed();
		System.out.println("�ν��Ͻ� ���� : "  + f.num);
		f.num = 200;
		System.out.println("�ν��Ͻ� ���� : " + f.num);
		
		// ��� Ŭ������ ���� ��ü ����(�ν��Ͻ�ȭ)
		Ex5_3_person p = new Ex5_3_person();
		
		System.out.println("�̸� : " + p.name);
		System.out.println("���� : " + p.age);
		p.walk();
		p.run();            // ������� p.name; �� ����   p.name(); �̰Ŵ� �޼ҵ�
		
		System.out.println(Ex5_3_person.phone);
		
		Calc calc = new Calc(); // ��ü ����
		calc.instanceNumFirst = 10;
		calc.instanceNumSecond = 20;
		
		System.out.println(calc.instanceNumFirst + calc.instanceNumSecond);
		
		Calc.classNumThird = 30;
		System.out.println(calc.instanceNumFirst + Calc.classNumThird);
		
		
		// ��ü �迭
		String[] s = new String[3];
		Ex5_3_person[] person = new Ex5_3_person[3]; // ��ü�迭 ����+����(�Ҵ�)
		
		person[0] = new Ex5_3_person();
		person[1] = new Ex5_3_person();
		person[2] = new Ex5_3_person();
		
		 
		person[0].addr = "�Ⱦ�";
		person[2].addr = "���";
		
		for(int i=0; i<person.length; i++) {
			System.out.println("���� i�� �� : " + i);
			System.out.println("addr : " + person[i].addr);
		}
		
		

	}
	
	public void add() {
		int localNum = 100; // ���� ����
	}

}

class Calc {
	
	public int instanceNumFirst;       // �ν��Ͻ� ����
	public int instanceNumSecond; 
	public static int classNumThird;    // Ŭ���� ����
	
	public void add() {    // ���� ���� ????
		instanceNumFirst = 10;
		instanceNumSecond = 20;
		
		System.out.println(instanceNumFirst + instanceNumSecond);
	}
}
