package kr.co.quiz;

public class Ex9_4_Character {
	
	Ex9_4_CharacterAbility ab = new Ex9_4_CharacterAbility(); 
	
	public int str;
	public int dex;
	public int knowledge;
	public int level;
	public int experience; 
	public int hp;
	public int mp;
	
	public Ex9_4_Character() {
		this.str = str;
		this.dex = dex;
		this.knowledge = knowledge;
	}
	
	public void walk(Ex9_4_CharacterAbility ab) {
		System.out.println("ĳ���Ͱ� �Ѱ��� �Ƚ��ϴ�.");
	}
	public void stop(Ex9_4_CharacterAbility ab) {
		System.out.println("ĳ���Ͱ� ����ϴ�.");
	}
	public void attack(Ex9_4_CharacterAbility ab) {
		System.out.println("����");
	}
	public void skill(Ex9_4_CharacterAbility ab) {
		System.out.println("���� ��ų ���");
	}
	public void charac(Ex9_4_CharacterAbility ab) {
		System.out.println("--------------------�������----------------------");
		System.out.println("LV : ");
		System.out.println("HP : ");
		System.out.println("MP : ");
		System.out.println("�� : "+ "��ø : " + "���� : ");
	}

	
	
	
	
	
}





//
//4. Character Ŭ������ �����ϰ� ��ӹ��� Warlord, Sorceress, Archer Ŭ������ �����ϼ���.
//5. Character Ŭ�������� �Ʒ��� ���� ������ �޼ҵ尡 �ֽ��ϴ�.
//-> walk() : "�ɸ��Ͱ� �Ѱ��� �Ƚ��ϴ�." ���
//-> stop() : "�ɸ��Ͱ� ����ϴ�." ���
//-> attack() : "����" ���
//-> skill() : "���� ��ų ���" ���