package kr.co.green;

public class Ex5_overloading {

	public static void main(String[] args) {
		
		Ex5_overloading o1 = new Ex5_overloading();
		
		o1.overloading(0, "ABC");
		o1.overloading("A");
		o1.overloading();
		
		
	}		
		
	
	public void overloading() {
		System.out.println("0�� �޼ҵ� : �Ű����� ����");
	}
	public void overloading(int num) {
		System.out.println("1�� �޼ҵ� : " + num);
	}
	public void overloading(String str) {
		System.out.println("2�� �޼ҵ� : " + str);
	}
	public void overloading(int num, String str) {
		System.out.println("3�� �޼ҵ� : " + num + " " + str);
	}
	public void overloading( String str, int num) {
		System.out.println("4�� �޼ҵ� : " + str + " " + num);
	}

}
