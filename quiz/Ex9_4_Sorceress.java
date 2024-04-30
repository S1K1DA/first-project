package kr.co.quiz;

public class Ex9_4_Sorceress extends Ex9_4_Character {
	
	public Ex9_4_Sorceress(Ex9_4_CharacterAbility ab) {
		ab.setStr(10);
		ab.setDex(10);
		ab.setKnowledge(50);
	}
	@Override
	public void charac(Ex9_4_CharacterAbility ab) {
		System.out.println("--------------------�Ҽ� ����â----------------------");
		System.out.println("LV : "+ab.getLevel());
		System.out.println("HP : "+ab.getHp());
		System.out.println("MP : "+ab.getMp());
		System.out.println("�� : "+ab.getStr()+ " ��ø : "+ab.getDex() + " ���� : "+ab.getKnowledge());
	}
	@Override
	public void walk(Ex9_4_CharacterAbility ab) {
		System.out.println("ĳ���Ͱ� �Ѱ��� �Ƚ��ϴ�.");
	}
	@Override
	public void stop(Ex9_4_CharacterAbility ab) {
		System.out.println("ĳ���Ͱ� ����ϴ�.");
	}
	@Override
	public void attack(Ex9_4_CharacterAbility ab) {
		if(ab.getHp()>0) {
			System.out.println("�Ҽ������� �����̸� �ֵθ��ϴ�.");
			ab.setHp(10);
			ab.setExperience(25);
			System.out.println("HP : " + ab.getHp());
			System.out.println("MP : " + ab.getMp());
			System.out.println("EXP : " + ab.getExperience());
			System.out.println("�Ҽ����� LV : " + ab.getLevel());
			System.out.println();
		} else if(ab.getHp()==0) {
			System.out.println("�Ҽ������� ������ ����ϴ�.");
			System.out.println();
		}
		}
	@Override
	public void skill(Ex9_4_CharacterAbility ab) {
		
		if(ab.getMp()>0) {
			System.out.println("�Ҽ������� ���̽� �ַο츦 ����մϴ�.");
			ab.setMp(10);
			ab.setExperience(50);
			System.out.println("HP : " + ab.getHp());
			System.out.println("MP : " + ab.getMp());
			System.out.println("EXP : " + ab.getExperience());
			System.out.println("�Ҽ����� LV : " + ab.getLevel());
			System.out.println();
		} else if(ab.getMp() == 0) {
			System.out.println("�Ҽ������� ��ų�� ��� ���մϴ�.");
			System.out.println();
	}
	
	}
}
//-> Sorceress ��ü ���� �� ��10, ��ø10, ����50���� �����˴ϴ�.
//-> attack() : "�����̸� �ֵθ��ϴ�.", ����ġ 25 ����, ü�� 10 ����
//                  ü���� 0�� ��� attack() ��� �Ұ�
//-> skill() : "���̽� �ַο츦 ��� �մϴ�." ���, ����ġ 50 ����, ���� 10 ����
//                ������ 0�� ��� skill() ��� �Ұ�
//-> levelUp() : "�������� �Ͽ� ������ 5 ���� �մϴ�." ��� �� ���� 5 ����