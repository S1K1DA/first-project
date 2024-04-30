package kr.co.quiz2;

public class Ex1_1_InternetUser {
	
	   private String username;
	   private String email;
	
	   //생성자
	    public Ex1_1_InternetUser(String username, String email) {
	    	this.username = username;
			this.email = email;
	}
       // 사용자 정보 출력 메서드
	    public void displayUserInfo() {
	    	System.out.println("사용자 이름 : " + username);
	        System.out.println("사용자 이메일 : " + email);
	    }
	    
	    
	    
	    
	    
	    
	    
	    
}
