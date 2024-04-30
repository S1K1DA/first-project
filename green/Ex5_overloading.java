package kr.co.green;

public class Ex5_overloading {

	public static void main(String[] args) {
		
		Ex5_overloading o1 = new Ex5_overloading();
		
		o1.overloading(0, "ABC");
		o1.overloading("A");
		o1.overloading();
		
		
	}		
		
	
	public void overloading() {
		System.out.println("0번 메소드 : 매개변수 없음");
	}
	public void overloading(int num) {
		System.out.println("1번 메소드 : " + num);
	}
	public void overloading(String str) {
		System.out.println("2번 메소드 : " + str);
	}
	public void overloading(int num, String str) {
		System.out.println("3번 메소드 : " + num + " " + str);
	}
	public void overloading( String str, int num) {
		System.out.println("4번 메소드 : " + str + " " + num);
	}

}
