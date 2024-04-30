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
		System.out.println("--------------------워리어 상태창----------------------");
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
			System.out.println("워리어가 둔기를 휘두릅니다.");
			ab.setHp(10);
			ab.setExperience(25);
			System.out.println("HP : " + ab.getHp());
			System.out.println("MP : " + ab.getMp());
			System.out.println("EXP : " + ab.getExperience());
			System.out.println("워리어 LV : " + ab.getLevel());
		    System.out.println();
		} else if(ab.getHp()==0) {
			System.out.println("워리어가 공격을 멈춥니다.");
			System.out.println();
		}
		}
	@Override
	public void skill(Ex9_4_CharacterAbility ab) {
		if(ab.getMp()>0) {
			System.out.println("워리어가 리프 어택을 사용 합니다.");
			ab.setMp(10);
			ab.setExperience(30);
			System.out.println("HP : " + ab.getHp());
			System.out.println("MP : " + ab.getMp());
			System.out.println("EXP : " + ab.getExperience());
			System.out.println("워리어 LV : " + ab.getLevel());
			System.out.println();
		} else if(ab.getMp() == 0) {
			System.out.println("워리어가 스킬을 사용 못합니다.");
			System.out.println();
	}
	
	}
}
//-> levelUp() : "레벨업을 하여 힘이 5 증가 합니다." 출력 및 힘 5 증가