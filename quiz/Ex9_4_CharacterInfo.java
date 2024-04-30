package kr.co.quiz;

public class Ex9_4_CharacterInfo {

	public static void main(String[] args) {
		
		
//		1. CharacterInfo 클래스 생성
//		   -> 메인 메소드를 생성하세요
//		   -> 메인 메소드에 워로드, 소서리스, 아처의 객체를 생성하세요.
//		   -> 워로드, 소서리스, 아처의 현재 능력치를 확인할 수 있는 메소드를 생성하세요.
//		        이 메소드는 메인 메소드 밖에 있고, static을 사용한 메소드 입니다.
//		       능력치는 CharacterAbility 클래스에 있습니다.
		
		
		Ex9_4_CharacterAbility aW = new Ex9_4_CharacterAbility(); 
		Ex9_4_CharacterAbility aA = new Ex9_4_CharacterAbility(); 
		Ex9_4_CharacterAbility aS = new Ex9_4_CharacterAbility(); 
		Ex9_4_Warlord W = new Ex9_4_Warlord(aW);
		Ex9_4_Archer A = new Ex9_4_Archer(aA);
		Ex9_4_Sorceress S = new Ex9_4_Sorceress(aS);
		
//		Ex9_4_Sorceress S = new Ex9_4_Sorceress();
//		Ex9_4_Archer A = new Ex9_4_Archer();
		System.out.println("--------------------워리어----------------------");
		System.out.println();
		W.attack(aW);
		
		W.skill(aW);
		
		W.skill(aW);
		W.skill(aW);
		W.skill(aW);
		W.skill(aW);
		W.skill(aW);
		W.skill(aW);
		W.skill(aW);
		W.skill(aW);
		W.skill(aW);
		W.skill(aW);
		W.skill(aW);
		W.skill(aW);
		W.skill(aW);
		W.skill(aW);
		W.skill(aW);
		W.skill(aW);
		W.skill(aW);
		W.skill(aW);
		W.skill(aW);
		W.skill(aW);
		W.charac(aW);
		
		System.out.println("--------------------소서리스----------------------"); 
          S.attack(aS);
          S.attack(aS);
          S.skill(aS);
          S.skill(aS);
          S.skill(aS);
          S.skill(aS);
          
          S.charac(aS);
		
		
		
		
		
		
		
		
		
		System.out.println("--------------------아처----------------------");
		
		A.attack(aA);
		A.attack(aA);
		A.attack(aA);
		A.attack(aA);
		A.attack(aA);
		A.attack(aA);
		A.attack(aA);
		A.skill(aA);
	    A.attack(aA);
	    A.attack(aA);
	    A.attack(aA);
	    A.attack(aA);
	    A.attack(aA);
	    A.skill(aA);A.skill(aA);
	    A.skill(aA);
	    A.skill(aA);
	    A.skill(aA);
	    A.skill(aA);
	    A.skill(aA);
	    A.skill(aA);
	    A.skill(aA);
	    A.skill(aA);


	    
	    A.charac(aA);
	    
		

	}

}
