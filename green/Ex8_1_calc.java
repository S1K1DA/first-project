package kr.co.green;

public class Ex8_1_calc {
	
	int num;         // ������ ȣ�� -> ��� ���� �ʱ�ȭ (num = 0)
	int age;
	String name;
	
	public void add() {
		int localVar;    
		System.out.println(localVar);
		
		System.out.println(num);
	}
	
	// �⺻ ������
	public Ex8_1_calc() {
		num = 100;
		System.out.println("�⺻ �����ڰ� ȣ��Ǿ����ϴ�.");
	}
	
	
	
	// �Ű����� �ִ� ������
	public Ex8_1_calc(int num, int age, String name) {
		this.num = num;
		this.age = age;
		this.name = name; 
				
	}

}




