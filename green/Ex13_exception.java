package kr.co.green;

public class Ex13_exception {

	public static void main(String[] args) {
		
		try {
		int[] numArr = new int[5];  // index ; 0~4
		System.out.println("예외 발생 전");
		numArr[5] = 10;
		System.out.println("예외 발생 후");
		} catch(Exception e) {
			System.out.println("예외 발생");
			System.out.println(e);
			
            e.printStackTrace();	
            
            System.out.println(e.getStackTrace()[0]);
//            e.getStackTrace();
            
            System.out.println(e.toString());
//             e.toString();
             
            System.out.println(e.getMessage());
//             e.getMessage();
			
		} finally {
			System.out.println("무조건 실행");
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
