package kr.co.quiz;

public class Ex9_3_Charater {

	public int str;
	public int dex;
	public int knowledge;
	public int level;
	
	public Ex9_3_Charater(int str,int dex, int knowledge) {
		this.str = str;
		this.dex = dex;
		this.knowledge = knowledge;
		this.level = level;
	}
	
	public void walk() {
		System.out.println("ĳ���Ͱ� �Ѱ��� �Ƚ��ϴ�.");
	}
	public void stop() {
		System.out.println("ĳ���Ͱ� ����ϴ�.");
	}
	public void attack() {
		System.out.println("����");
	}
	public void skill() {
		System.out.println("���� ��ų ���");
	}
	
	
	
	
	
	
}

//1. Character Ŭ������ �����ϰ� ��ӹ��� Warlord, Sorceress, Archer Ŭ������ �����ϼ���.
//2. Character Ŭ�������� �Ʒ��� ���� ������ �޼ҵ尡 �ֽ��ϴ�.
//   -> str(��)
//   -> dex(��ø)
//   -> knowledge(����)
//   -> level(����)
//   -> walk() : "�ɸ��Ͱ� �Ѱ��� �Ƚ��ϴ�." ���
//   -> stop() : "�ɸ��Ͱ� ����ϴ�." ���
//   -> attack() : "����" ���
//   -> skill() : "���� ��ų ���" ���