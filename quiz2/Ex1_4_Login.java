package kr.co.quiz2;

public class Ex1_4_Login implements Ex1_4_LoginInterface {
	String memberId = "id";
	String memberPwd = "qwe1234";
	
	
	
	@Override
	public String Login(String Id,String Pwd) {    // �θ� ()���� ���� �Ű����� �־������. 
		if(Id.equals(memberId)) {
			if(Pwd.equals(memberPwd)) {
				return "�α��� �Ǿ����ϴ�.";
			} else {
				return "��й�ȣ�� Ʋ�Ƚ��ϴ�.";
			}
		} else {
			return "���̵� Ʋ�Ƚ��ϴ�.";
		}
		
	}   
		
	
	

}
