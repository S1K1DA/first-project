package kr.co.quiz;

public class Ex9_3_Sorceress extends Ex9_3_Charater {

	public Ex9_3_Sorceress(int str,int dex,int knowledge) {
		super(10,10,50);
	}
	@Override
	public void attack() {
		System.out.println("���簡 �����̸� �ֵθ��ϴ�.");
	}
	@Override
	public void skill() {
		System.out.println("���簡 ���̽� �ַο츦 ��� �մϴ�.");
	}
	
	public void levelup() {
		level++;
		knowledge = knowledge+5;
		System.out.println("���簡 �������� �Ͽ� ������ 5 ���� �մϴ�. ���� ����:" + knowledge);
		System.out.println("���� ���� ���� : " + level);
	}
	
	
	
	
}


//4. Sorceress Ŭ�������� �Ʒ��� ���� �޼ҵ尡 �ֽ��ϴ�.
//-> Sorceress ��ü ���� �� ��10, ��ø10, ����50���� �����˴ϴ�.
//-> attack() : "�����̸� �ֵθ��ϴ�."
//-> skill() : "���̽� �ַο츦 ��� �մϴ�." ���
//-> levelUp() : "�������� �Ͽ� ������ 5 ���� �մϴ�." ��� �� ���� 5 ����