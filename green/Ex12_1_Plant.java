package kr.co.green;

public abstract class Ex12_1_Plant extends Ex12_1_Organism {
	
	@Override
	public void eat() {
		System.out.println("������ ���ռ��� �մϴ�..");
	}
//	@Override
//	public abstract void breathe() {
//		System.out.println("������ ��ȯ ����� ���� ȣ���մϴ�..");
//	}
//
//}
	
	
  class Ex12_A extends Ex12_1_Plant{
	  
		@Override
		public void breathe() {
			System.out.println("AŬ����");
  }
		
	}
}
