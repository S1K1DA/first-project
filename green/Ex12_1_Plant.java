package kr.co.green;

public abstract class Ex12_1_Plant extends Ex12_1_Organism {
	
	@Override
	public void eat() {
		System.out.println("생물이 광합성을 합니다..");
	}
//	@Override
//	public abstract void breathe() {
//		System.out.println("생물이 교환 기능을 통해 호흡합니다..");
//	}
//
//}
	
	
  class Ex12_A extends Ex12_1_Plant{
	  
		@Override
		public void breathe() {
			System.out.println("A클래스");
  }
		
	}
}
