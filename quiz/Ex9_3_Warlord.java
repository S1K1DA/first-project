package kr.co.quiz;

public class Ex9_3_Warlord extends Ex9_3_Charater {
	

	public Ex9_3_Warlord(int str,int dex,int knowledge) {
		super(50,10,10);
	}
	@Override
	public void attack() {
		System.out.println("워로드가 둔기를 휘두릅니다.");
	}
	@Override
	public void skill() {
		System.out.println("워로드가 리프 어택을 사용 합니다.");
	}
	
	public void levelup() {
		level++;
		str = str+5;
		System.out.println("워로드가 레벨업을 하여 힘이 5 증가 합니다. 현재 힘: " + str);
		System.out.println("워로드 현재 레벨 : " + level);
	}
	
	
	
	
}


//3. Warlord 클래스에는 아래와 같은 메소드가 있습니다.
//-> Warlord는 객체 생성 시 힘50, 민첩10, 지력10으로 생성됩니다.
//-> attack() : "둔기를 휘두릅니다." 출력
//-> skill() : "리프 어택을 사용 합니다." 출력
//-> levelUp() : "레벨업을 하여 힘이 5 증가 합니다." 출력 및 힘 5 증가