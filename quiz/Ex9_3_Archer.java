package kr.co.quiz;

public class Ex9_3_Archer extends Ex9_3_Charater {

	
	public Ex9_3_Archer(int str,int dex,int knowledge) {
		super(10,50,10);
	}
	
	@Override
	public void attack() {
		System.out.println("��ó�� Ȱ�� ���ϴ�.");
	}
	@Override
	public void skill() {
		System.out.println("��ó�� ���� ������ ��� �մϴ�.");
	}
	
	public void levelup() {
		level++;
		dex = dex+5;
		System.out.println("��ó�� �������� �Ͽ� ��ø�� 5 ���� �մϴ�. ���� ��ø:" + dex);
	}
	
 
}


//5. Archer Ŭ�������� �Ʒ��� ���� �޼ҵ尡 �ֽ��ϴ�.
//-> Archer ��ü ���� �� ��10, ��ø50, ����10���� �����˴ϴ�.
//-> attack() : "Ȱ�� ���ϴ�."
//-> skill() : "���� ������ ��� �մϴ�." ��� 
//-> levelUp() : "�������� �Ͽ� ��ø�� 5 ���� �մϴ�." ��� �� ��ø 5 ����