package kr.co.green;

public class Ex9_1_Child extends Ex9_1_Parent {
	
	public String childVar = "자식변수";
	
	public void childMethod() {
		System.out.println("자식 클래스");
		String str1 = "a";
		String str2 = "b";
		str1.equals(str2);
		
	}
	
	@Override
	public void parentMethod() {
		//구현부
		System.out.println("오바라이딩된 메서드");
	}
	

}
