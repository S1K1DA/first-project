package kr.co.eunsik;

public class VarEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    final int SCORE = 100;
	    
	    
	    byte b = 127;
	    
	    System.out.println(SCORE);
	    
        boolean power = false;	   
	    
	    long l = 10_000_000_000L;   
	    
	    float f = 3.14f;   //float는 f 붙여줘야함 아마도?
	    double d = 3.14;  
	    
	    System.out.println(10.);  // 10.0
	    System.out.println(.10);  // 0.1 
	    System.out.println(10f);  // 10.0
	    System.out.println(1e3);  // 1000.0
	    
	    char ch = 'A';
	    String str = "ABC";
	    
	    String s = "" + 7 + 7;
	    String s1 = "7" + 7;
	    String s2 = 7 + 7 + "";
	    System.out.println(s);
	    System.out.println(s1);
	    System.out.println(s2);
	    System.out.println(str);
		
		

	}

}
