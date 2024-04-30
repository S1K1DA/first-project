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
		System.out.println("캐릭터가 한걸음 걷습니다.");
	}
	public void stop() {
		System.out.println("캐릭터가 멈춥니다.");
	}
	public void attack() {
		System.out.println("공격");
	}
	public void skill() {
		System.out.println("공통 스킬 사용");
	}
	
	
	
	
	
	
}

//1. Character 클래스를 생성하고 상속받을 Warlord, Sorceress, Archer 클래스를 생성하세요.
//2. Character 클래스에는 아래와 같은 변수와 메소드가 있습니다.
//   -> str(힘)
//   -> dex(민첩)
//   -> knowledge(지력)
//   -> level(레벨)
//   -> walk() : "케릭터가 한걸음 걷습니다." 출력
//   -> stop() : "케릭터가 멈춥니다." 출력
//   -> attack() : "공격" 출력
//   -> skill() : "공통 스킬 사용" 출력