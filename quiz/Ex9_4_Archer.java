package kr.co.quiz;

public class Ex9_4_Archer extends Ex9_4_Character {

	
	public Ex9_4_Archer(Ex9_4_CharacterAbility ab) {
		ab.setStr(10);
		ab.setDex(50);
		ab.setKnowledge(10);

	}
	@Override
	public void charac(Ex9_4_CharacterAbility ab) {
		System.out.println("--------------------아처 상태창----------------------");
		System.out.println("LV : "+ab.getLevel());
		System.out.println("HP : "+ab.getHp());
		System.out.println("MP : "+ab.getMp());
		System.out.println("힘 : "+ab.getStr()+ " 민첩 : "+ab.getDex() + " 지능 : "+ab.getKnowledge());
	}
	@Override
	public void walk(Ex9_4_CharacterAbility ab) {
		System.out.println("캐릭터가 한걸음 걷습니다.");
	}
	@Override
	public void stop(Ex9_4_CharacterAbility ab) {
		System.out.println("캐릭터가 멈춥니다.");
	}
	@Override
	public void attack(Ex9_4_CharacterAbility ab) {
		if(ab.getHp()>0) {
			System.out.println("아처가 활을 쏩니다.");
			ab.setHp(10);
			ab.setExperience(25);
			System.out.println("HP : " + ab.getHp());
			System.out.println("MP : " + ab.getMp());
			System.out.println("EXP : " + ab.getExperience());
			System.out.println("아처 LV : " + ab.getLevel());
			System.out.println();
		} else if(ab.getHp()==0) {
			System.out.println("아처가 공격을 하지 못합니다.");
			System.out.println();
		}
		}
	@Override
	public void skill(Ex9_4_CharacterAbility ab) {
		if(ab.getMp()>0) {
			System.out.println("아처가 집중 마력을 사용합니다.");
			ab.setMp(10);
			ab.setExperience(50);
			System.out.println("HP : " + ab.getHp());
			System.out.println("MP : " + ab.getMp());
			System.out.println("EXP : " + ab.getExperience());
			System.out.println("아처 LV : " + ab.getLevel());
			System.out.println();
		} else if(ab.getMp() == 0) {
			System.out.println("아처가 스킬을 사용 못합니다.");
			System.out.println();
	}
	
	}
}