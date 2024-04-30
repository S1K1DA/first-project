package kr.co.quiz;

public class Ex9_3_Archer extends Ex9_3_Charater {

	
	public Ex9_3_Archer(int str,int dex,int knowledge) {
		super(10,50,10);
	}
	
	@Override
	public void attack() {
		System.out.println("아처가 활을 쏩니다.");
	}
	@Override
	public void skill() {
		System.out.println("아처가 집중 공격을 사용 합니다.");
	}
	
	public void levelup() {
		level++;
		dex = dex+5;
		System.out.println("아처가 레벨업을 하여 민첩이 5 증가 합니다. 현재 민첩:" + dex);
	}
	
 
}


//5. Archer 클래스에는 아래와 같은 메소드가 있습니다.
//-> Archer 객체 생성 시 힘10, 민첩50, 지력10으로 생성됩니다.
//-> attack() : "활을 쏩니다."
//-> skill() : "집중 공격을 사용 합니다." 출력 
//-> levelUp() : "레벨업을 하여 민첩이 5 증가 합니다." 출력 및 민첩 5 증가