package kr.co.quiz;

public class Ex5_4_rating {
	// ���� �ν��Ͻ� ���� ����(rating)
	public double rating;
	
	// ����� ���� ������� ���� ���� ����
	public final double USER_A_RATING = 3;
	public final double USER_B_RATING = 2;
	public final double USER_C_RATING = 2.5;
	public final double USER_D_RATING = 5;
	public final double USER_E_RATING = 4;
	
	// getAvgRating() �޼��带 �����ϴµ�
	// ����ڰ� �Է��� �� 1���� ���� ����(�Ű� ����)
	public double getAvgRating(double num) {
		double sum = (USER_A_RATING+USER_B_RATING+USER_C_RATING+USER_D_RATING+USER_E_RATING+num);
		double avg = sum/6;
		return avg;
	}
	// A~E������ ���� ������ ���޹��� ������ �հ踦 ���� �� ��� ������ ����
	// ��� ������ ��ȯ

}
