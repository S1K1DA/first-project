package kr.co.quiz;

public class Ex9_3_Warlord extends Ex9_3_Charater {
	

	public Ex9_3_Warlord(int str,int dex,int knowledge) {
		super(50,10,10);
	}
	@Override
	public void attack() {
		System.out.println("���ε尡 �б⸦ �ֵθ��ϴ�.");
	}
	@Override
	public void skill() {
		System.out.println("���ε尡 ���� ������ ��� �մϴ�.");
	}
	
	public void levelup() {
		level++;
		str = str+5;
		System.out.println("���ε尡 �������� �Ͽ� ���� 5 ���� �մϴ�. ���� ��: " + str);
		System.out.println("���ε� ���� ���� : " + level);
	}
	
	
	
	
}


//3. Warlord Ŭ�������� �Ʒ��� ���� �޼ҵ尡 �ֽ��ϴ�.
//-> Warlord�� ��ü ���� �� ��50, ��ø10, ����10���� �����˴ϴ�.
//-> attack() : "�б⸦ �ֵθ��ϴ�." ���
//-> skill() : "���� ������ ��� �մϴ�." ���
//-> levelUp() : "�������� �Ͽ� ���� 5 ���� �մϴ�." ��� �� �� 5 ����