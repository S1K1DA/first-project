package kr.co.quiz2;

public class Ex1_1_PremiumUser extends Ex1_1_InternetUser {
	
	
	private int membershipPeriod;
	
	
	
	
	public Ex1_1_PremiumUser(String username, String email, int membershipPeriod) {
		super(username, email);
		this.membershipPeriod = membershipPeriod;
	}

//	public void PremiumUser(String username,String email, int membershipPeriod) {
//		this.membershipPeriod = membershipPeriod;
//	}
	
	public void displayMembershipPeriod() {
		System.out.println("�����̾� �ɹ��� �Ⱓ : " + membershipPeriod + "����");
	}
	
	
	

}
