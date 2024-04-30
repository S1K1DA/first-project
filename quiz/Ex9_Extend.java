package kr.co.quiz;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Ex9_Extend {

	public static void main(String[] args) {
		
		Ex9_1_Student s = new Ex9_1_Student();
		s.displayInfo("dms",19,"0001");
		
		
		Ex9_2_Dog d = new Ex9_2_Dog("∞≠≥√¿Ã",4);
		Ex9_2_Cat c = new Ex9_2_Cat("»£µŒ",3);
		
		d.eat();
		d.sleep();
		System.out.println();
		c.eat();
		c.sleep();
		System.out.println();
		
		c.makeSound();
		d.makeSound();
		
		
//		Ex9_3_Archer A = new Ex9_3_Archer(10,50,10);
//		Ex9_3_Sorceress S = new Ex9_3_Sorceress(10,10,50);
//		Ex9_3_Warlord W = new Ex9_3_Warlord(50,10,10);
//		
//		A.attack();
//		A.skill();
//		A.levelup();
//		
//		System.out.println();
//		
//		S.attack();
//		S.skill();
//		S.levelup();
//		
//		System.out.println();
//		
//		W.attack();
//		W.skill();
//		W.levelup();
//		W.levelup();
		
		
		

	}

}
