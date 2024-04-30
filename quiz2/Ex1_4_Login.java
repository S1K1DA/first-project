package kr.co.quiz2;

public class Ex1_4_Login implements Ex1_4_LoginInterface {
	String memberId = "id";
	String memberPwd = "qwe1234";
	
	
	
	@Override
	public String Login(String Id,String Pwd) {    // 부모꺼 ()에도 같이 매개변수 넣어놔야함. 
		if(Id.equals(memberId)) {
			if(Pwd.equals(memberPwd)) {
				return "로그인 되었습니다.";
			} else {
				return "비밀번호가 틀렸습니다.";
			}
		} else {
			return "아이디가 틀렸습니다.";
		}
		
	}   
		
	
	

}
