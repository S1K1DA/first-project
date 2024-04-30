package kr.co.quiz;

public class Ex5_4_rating {
	// 평점 인스턴스 변수 생성(rating)
	public double rating;
	
	// 상수로 이전 사람들이 남긴 평점 생성
	public final double USER_A_RATING = 3;
	public final double USER_B_RATING = 2;
	public final double USER_C_RATING = 2.5;
	public final double USER_D_RATING = 5;
	public final double USER_E_RATING = 4;
	
	// getAvgRating() 메서드를 생성하는데
	// 사용자가 입력한 값 1개를 전달 받음(매개 변수)
	public double getAvgRating(double num) {
		double sum = (USER_A_RATING+USER_B_RATING+USER_C_RATING+USER_D_RATING+USER_E_RATING+num);
		double avg = sum/6;
		return avg;
	}
	// A~E유저가 남긴 평점과 전달받은 평점의 합계를 구한 후 평균 점수를 구함
	// 평균 점수를 반환

}
