package kr.co.quiz;

public class Ex9_3_Sorceress extends Ex9_3_Charater {

	public Ex9_3_Sorceress(int str,int dex,int knowledge) {
		super(10,10,50);
	}
	@Override
	public void attack() {
		System.out.println("법사가 지팡이를 휘두릅니다.");
	}
	@Override
	public void skill() {
		System.out.println("법사가 아이스 애로우를 사용 합니다.");
	}
	
	public void levelup() {
		level++;
		knowledge = knowledge+5;
		System.out.println("법사가 레벨업을 하여 지력이 5 증가 합니다. 현재 지력:" + knowledge);
		System.out.println("법사 현재 레벨 : " + level);
	}
	
	
	
	
}


//4. Sorceress 클래스에는 아래와 같은 메소드가 있습니다.
//-> Sorceress 객체 생성 시 힘10, 민첩10, 지력50으로 생성됩니다.
//-> attack() : "지팡이를 휘두릅니다."
//-> skill() : "아이스 애로우를 사용 합니다." 출력
//-> levelUp() : "레벨업을 하여 지력이 5 증가 합니다." 출력 및 지력 5 증가