package kr.co.green;

import java.util.ArrayList;
import java.util.Scanner;

class Students {
	private String name;
	private int score;
	public Students(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	
}

public class Ex14_StudentGradeAnalyzer {

	public static void main(String[] args) {
		ArrayList<Students> list = new ArrayList<>();    // 학생 리스트
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1. 학생 성적 추가");
			System.out.println("2. 전체 성적 평균 조회");
			System.out.println("3. 최고 성적 학생 정보");
			System.out.println("4. 최저 성적 학생 정보");
			System.out.println("5. 모든 학생들의 성적 조회");
			System.out.println("6. 종료");
			System.out.println("메뉴를 선택하세요 : ");
			int select = sc.nextInt();
			sc.nextLine();
			
			switch(select){
				case 1:  // 학생 이름 및 점수 입력
					System.out.print("학생 이름을 입력하세요: ");
					String name = sc.nextLine();
					
					System.out.print("학생 성적을 입력하세요(0~100) : ");
					int score = sc.nextInt();
					sc.nextLine();
					
					Students s = new Students(name, score);
					list.add(s);
					System.out.println("-------------------------------------");
					
					break;
				case 2:   // 전체 성적 평균 조회
					int totalScore = 0;
					
					for(int i =0; i<list.size(); i++) {
						totalScore = totalScore+list.get(i).getScore();
					}
					System.out.println("전체 평균 점수 : " + totalScore/list.size());
					break;
				case 3:   //  최고 점수
					int max = list.get(0).getScore();
					String maxName = "";
					
					for(int i=0; i<list.size(); i++) {
						if(max<list.get(i).getScore()) {
							max = list.get(i).getScore();
						}
					}
					System.out.println("이름 : " + maxName);
					System.out.println("최고 점수 : " + max);
					
					break;
				case 4:   //  최저 점수
					int min = list.get(0).getScore();
					String minName = list.get(0).getName();
					
					//for-each 문 사용하기
					for(Students item : list) {
						
						if(min > item.getScore()) {
							min = item.getScore();
							minName = item.getName();
						}
					}
					System.out.println("이름 : " + minName);
					System.out.println("최저 점수 : " + min);
					
					break;
				case 5:
					for(int i=0; i<list.size(); i++) {
						System.out.println(list.get(i).getName() + " ( " + list.get(i).getScore() + " ) ");
					}
					
					
					
					break;
				case 6:
					break;
			   default:
			}
					
		}
		

	}

}
