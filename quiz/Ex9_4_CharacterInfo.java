package kr.co.quiz;

public class Ex9_4_CharacterInfo {

	public static void main(String[] args) {
		
		
//		1. CharacterInfo Ŭ���� ����
//		   -> ���� �޼ҵ带 �����ϼ���
//		   -> ���� �޼ҵ忡 ���ε�, �Ҽ�����, ��ó�� ��ü�� �����ϼ���.
//		   -> ���ε�, �Ҽ�����, ��ó�� ���� �ɷ�ġ�� Ȯ���� �� �ִ� �޼ҵ带 �����ϼ���.
//		        �� �޼ҵ�� ���� �޼ҵ� �ۿ� �ְ�, static�� ����� �޼ҵ� �Դϴ�.
//		       �ɷ�ġ�� CharacterAbility Ŭ������ �ֽ��ϴ�.
		
		
		Ex9_4_CharacterAbility aW = new Ex9_4_CharacterAbility(); 
		Ex9_4_CharacterAbility aA = new Ex9_4_CharacterAbility(); 
		Ex9_4_CharacterAbility aS = new Ex9_4_CharacterAbility(); 
		Ex9_4_Warlord W = new Ex9_4_Warlord(aW);
		Ex9_4_Archer A = new Ex9_4_Archer(aA);
		Ex9_4_Sorceress S = new Ex9_4_Sorceress(aS);
		
//		Ex9_4_Sorceress S = new Ex9_4_Sorceress();
//		Ex9_4_Archer A = new Ex9_4_Archer();
		System.out.println("--------------------������----------------------");
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
		
		System.out.println("--------------------�Ҽ�����----------------------"); 
          S.attack(aS);
          S.attack(aS);
          S.skill(aS);
          S.skill(aS);
          S.skill(aS);
          S.skill(aS);
          
          S.charac(aS);
		
		
		
		
		
		
		
		
		
		System.out.println("--------------------��ó----------------------");
		
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
