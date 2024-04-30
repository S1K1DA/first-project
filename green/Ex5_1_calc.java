package kr.co.green;

public class Ex5_1_calc {
	
	// µ¡¼À ±â´ÉÀ» ¼öÇàÇÏ´Â ¸Ş¼­µå
	    public int add(int add1,int add2) {
		System.out.println("µ¡¼À °á°ú : " + (add1+add2) );
		return add1+add2;
	    }
	
	// –E¼À ±â´ÉÀ» ¼öÇàÇÏ´Â ¸Ş¼­µå
		public void sub(int sub1,int sub2) {
		System.out.println("»¬¼À °á°ú : " + (sub1-sub2));
		}
	
	// °ö¼À ±â´ÉÀ» ¼öÇàÇÏ´Â ¸Ş¼­µå
	    public String mul(int mul1,int mul2) {
	    System.out.println("°ö¼À °á°ú : "+(mul1*mul2));
	    return "°ö¼À ¼º°ø!";
	    }
	    
	// ³ª´°¼À(¸ò) ±â´ÉÀ» ¼öÇàÇÏ´Â ¸Ş¼­µå
	    public void div(int div1, int div2) {
	    System.out.println("³ª´°¼À(¸ò) °á°ú : "+(div1%div2));
	    }
	
	
	
	
	
	
}

	
