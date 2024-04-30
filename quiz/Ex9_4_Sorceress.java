package kr.co.quiz;

public class Ex9_4_Sorceress extends Ex9_4_Character {
	
	public Ex9_4_Sorceress(Ex9_4_CharacterAbility ab) {
		ab.setStr(10);
		ab.setDex(10);
		ab.setKnowledge(50);
	}
	@Override
	public void charac(Ex9_4_CharacterAbility ab) {
		System.out.println("--------------------소서 상태창----------------------");
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
			System.out.println("소서리스가 지팡이를 휘두릅니다.");
			ab.setHp(10);
			ab.setExperience(25);
			System.out.println("HP : " + ab.getHp());
			System.out.println("MP : " + ab.getMp());
			System.out.println("EXP : " + ab.getExperience());
			System.out.println("소서리스 LV : " + ab.getLevel());
			System.out.println();
		} else if(ab.getHp()==0) {
			System.out.println("소서리스가 공격을 멈춥니다.");
			System.out.println();
		}
		}
	@Override
	public void skill(Ex9_4_CharacterAbility ab) {
		
		if(ab.getMp()>0) {
			System.out.println("소서리스가 아이스 애로우를 사용합니다.");
			ab.setMp(10);
			ab.setExperience(50);
			System.out.println("HP : " + ab.getHp());
			System.out.println("MP : " + ab.getMp());
			System.out.println("EXP : " + ab.getExperience());
			System.out.println("소서리스 LV : " + ab.getLevel());
			System.out.println();
		} else if(ab.getMp() == 0) {
			System.out.println("소서리스가 스킬을 사용 못합니다.");
			System.out.println();
	}
	
	}
}
//-> Sorceress 객체 생성 시 힘10, 민첩10, 지력50으로 생성됩니다.
//-> attack() : "지팡이를 휘두릅니다.", 경험치 25 증가, 체력 10 감소
//                  체력이 0일 경우 attack() 사용 불가
//-> skill() : "아이스 애로우를 사용 합니다." 출력, 경험치 50 증가, 마력 10 감소
//                마력이 0일 경우 skill() 사용 불가
//-> levelUp() : "레벨업을 하여 지력이 5 증가 합니다." 출력 및 지력 5 증가