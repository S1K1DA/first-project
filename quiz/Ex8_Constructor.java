package kr.co.quiz;

public class Ex8_Constructor {

	public static void main(String[] args) {
		// �⺻ ������ ȣ���� name, price, count ���
		// �Ű����� �ִ� ������(1) ȣ���� name, price, count ���
		// �Ű����� �ִ� ������(2) ȣ���� name, price, count ���

		
		Ex8_1_Product p1 = new Ex8_1_Product("���",10000,5);
		System.out.println(p1.name+" " + p1.price + "�� " + p1.count+"��");
		
			
		Ex8_1_Product p2 = new Ex8_1_Product("���",10000);
		System.out.println(p2.name+" " + p2.price + "��");
		
		
//		                                   ����     �����    ���콺   ����ũž
		// Ex8_2_Buy ��ü ���� = ������ ȣ���� �� 200000, 130000, 50000, 150000
		
		// buyMonitor, buyMouse, buyDesktop �޼ҵ� �ƹ��ų� ȣ���غ���
		
		Ex8_2_Buy B = new Ex8_2_Buy(200000,130000,50000,150000);
		
		B.buyMonitor();
		
		B.buyDesktop();
		
		B.buyMouse();
		
		Ex8_3_Student S = new Ex8_3_Student();
		Ex8_3_Student S1 = new Ex8_3_Student("��Ű",19,6,"2015203003");
		
		
		
		System.out.println("�̸��� : " + S.name);
		System.out.println("���̴� : " + S.age);
		System.out.println("�г��� : " + S.grade);
		System.out.println("�й��� : " + S.studentNumber);
		
		System.out.println(S1.name);
		System.out.println(S1.age);
		System.out.println(S1.grade);
		System.out.println(S1.studentNumber);
		
		
		
		// �⺻ ������ x
		Ex8_4_Order o = new Ex8_4_Order();
		// setter �̿�
		// �ֹ���ȣ : ORD123 , �ֹ��ݾ� : 100.5   �ָ����� : ó����
		
		
		// getter�� �� �ϳ��� ���
		o.setOderNumber("ORD123");
		o.setOderAmount(100.5);
		o.setOderStatus("ó����");
//		System.out.println(o.getOderNumber());
//		System.out.println(o.getOderAmount());
//		System.out.println(o.getOderStatus());
		
		System.out.println();
		o.amountCheck(100);
		
		
		// Ex8_4_Order�� �޼ҵ带 ���鲫��
		// amountCheck() ȣ��
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
