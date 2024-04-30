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
		System.out.println("캐릭터가 한걸음 걷습니다.");
	}
	public void stop(Ex9_4_CharacterAbility ab) {
		System.out.println("캐릭터가 멈춥니다.");
	}
	public void attack(Ex9_4_CharacterAbility ab) {
		System.out.println("공격");
	}
	public void skill(Ex9_4_CharacterAbility ab) {
		System.out.println("공통 스킬 사용");
	}
	public void charac(Ex9_4_CharacterAbility ab) {
		System.out.println("--------------------현재상태----------------------");
		System.out.println("LV : ");
		System.out.println("HP : ");
		System.out.println("MP : ");
		System.out.println("힘 : "+ "민첩 : " + "지능 : ");
	}

	
	
	
	
	
}





//
//4. Character 클래스를 생성하고 상속받을 Warlord, Sorceress, Archer 클래스를 생성하세요.
//5. Character 클래스에는 아래와 같은 변수와 메소드가 있습니다.
//-> walk() : "케릭터가 한걸음 걷습니다." 출력
//-> stop() : "케릭터가 멈춥니다." 출력
//-> attack() : "공격" 출력
//-> skill() : "공통 스킬 사용" 출력