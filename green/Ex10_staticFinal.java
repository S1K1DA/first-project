package kr.co.green;

public class Ex10_staticFinal {

	public static void main(String[] args) {

		//		Ex10_static.str; 
		
		System.out.println(Ex10_static.str);
		Ex10_static.staticMethod();

	}

}



class Ex10_static {
	public static String str = "ABC";
	
	public static void staticMethod() {
		System.out.println("Ãâ·Â");
	}
	
}
