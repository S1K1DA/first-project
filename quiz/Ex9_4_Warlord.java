package kr.co.quiz;


public class Ex9_4_Warlord extends Ex9_4_Character {
	
//	Ex9_4_CharacterAbility ab = new Ex9_4_CharacterAbility(); 
	
	
	public  Ex9_4_Warlord(Ex9_4_CharacterAbility ab) {
		ab.setStr(50);
		ab.setDex(10);
		ab.setKnowledge(10);
	}
	@Override
	public void charac(Ex9_4_CharacterAbility ab) {
		System.out.println("--------------------������ ����â----------------------");
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
			System.out.println("����� �б⸦ �ֵθ��ϴ�.");
			ab.setHp(10);
			ab.setExperience(25);
			System.out.println("HP : " + ab.getHp());
			System.out.println("MP : " + ab.getMp());
			System.out.println("EXP : " + ab.getExperience());
			System.out.println("������ LV : " + ab.getLevel());
		    System.out.println();
		} else if(ab.getHp()==0) {
			System.out.println("����� ������ ����ϴ�.");
			System.out.println();
		}
		}
	@Override
	public void skill(Ex9_4_CharacterAbility ab) {
		if(ab.getMp()>0) {
			System.out.println("����� ���� ������ ��� �մϴ�.");
			ab.setMp(10);
			ab.setExperience(30);
			System.out.println("HP : " + ab.getHp());
			System.out.println("MP : " + ab.getMp());
			System.out.println("EXP : " + ab.getExperience());
			System.out.println("������ LV : " + ab.getLevel());
			System.out.println();
		} else if(ab.getMp() == 0) {
			System.out.println("����� ��ų�� ��� ���մϴ�.");
			System.out.println();
	}
	
	}
}
//-> levelUp() : "�������� �Ͽ� ���� 5 ���� �մϴ�." ��� �� �� 5 ����