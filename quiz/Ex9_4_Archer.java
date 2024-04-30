package kr.co.quiz;

public class Ex9_4_Archer extends Ex9_4_Character {

	
	public Ex9_4_Archer(Ex9_4_CharacterAbility ab) {
		ab.setStr(10);
		ab.setDex(50);
		ab.setKnowledge(10);

	}
	@Override
	public void charac(Ex9_4_CharacterAbility ab) {
		System.out.println("--------------------��ó ����â----------------------");
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
			System.out.println("��ó�� Ȱ�� ���ϴ�.");
			ab.setHp(10);
			ab.setExperience(25);
			System.out.println("HP : " + ab.getHp());
			System.out.println("MP : " + ab.getMp());
			System.out.println("EXP : " + ab.getExperience());
			System.out.println("��ó LV : " + ab.getLevel());
			System.out.println();
		} else if(ab.getHp()==0) {
			System.out.println("��ó�� ������ ���� ���մϴ�.");
			System.out.println();
		}
		}
	@Override
	public void skill(Ex9_4_CharacterAbility ab) {
		if(ab.getMp()>0) {
			System.out.println("��ó�� ���� ������ ����մϴ�.");
			ab.setMp(10);
			ab.setExperience(50);
			System.out.println("HP : " + ab.getHp());
			System.out.println("MP : " + ab.getMp());
			System.out.println("EXP : " + ab.getExperience());
			System.out.println("��ó LV : " + ab.getLevel());
			System.out.println();
		} else if(ab.getMp() == 0) {
			System.out.println("��ó�� ��ų�� ��� ���մϴ�.");
			System.out.println();
	}
	
	}
}