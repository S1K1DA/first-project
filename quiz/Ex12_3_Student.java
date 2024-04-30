package kr.co.quiz;

public class Ex12_3_Student implements Ex12_3_StudentInterface {

	String name;
	int kor, eng, mat, sci;
	int sum;
	public Ex12_3_Student() {}
	public Ex12_3_Student(String inputName, int inputKor, int inputEng, int inputMat, int inputSci) {
		this.name = inputName;
		this.kor = inputKor;
		this.eng = inputEng;
		this.mat = inputMat;
		this.sci = inputSci;
	}
	
	
	
	
	
	
	
	// 아래 각각의 메소드들에 대한 추상 메소드를
	// 인터페이스에 작성
	@Override
	public void getSum() {
		int sum = kor+eng+mat+sci;
		System.out.println(name+"님의 합계 점수는 "+sum+"점 입니다.");
	}
	
	@Override
	public int getAvg() {
		int avg = (kor+eng+mat+sci) / 4;
		System.out.println(name+"님의 평균 점수는 "+avg+"점 입니다.");
		return avg;
	}
	
	@Override
	public void getRank(int getAvg) {
		
		double[] arry = {STUDENT_A_AVG, STUDENT_B_AVG, STUDENT_C_AVG,
						 STUDENT_D_AVG, STUDENT_E_AVG};
		
		int myRank = 1;
		
		for(double item : arry) {
			if(getAvg < item) {
				myRank++;
			}
		}
		System.out.println("당신의 등수는 : " + myRank);
	}
	
	
}
