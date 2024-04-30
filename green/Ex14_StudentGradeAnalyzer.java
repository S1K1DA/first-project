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
		ArrayList<Students> list = new ArrayList<>();    // �л� ����Ʈ
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1. �л� ���� �߰�");
			System.out.println("2. ��ü ���� ��� ��ȸ");
			System.out.println("3. �ְ� ���� �л� ����");
			System.out.println("4. ���� ���� �л� ����");
			System.out.println("5. ��� �л����� ���� ��ȸ");
			System.out.println("6. ����");
			System.out.println("�޴��� �����ϼ��� : ");
			int select = sc.nextInt();
			sc.nextLine();
			
			switch(select){
				case 1:  // �л� �̸� �� ���� �Է�
					System.out.print("�л� �̸��� �Է��ϼ���: ");
					String name = sc.nextLine();
					
					System.out.print("�л� ������ �Է��ϼ���(0~100) : ");
					int score = sc.nextInt();
					sc.nextLine();
					
					Students s = new Students(name, score);
					list.add(s);
					System.out.println("-------------------------------------");
					
					break;
				case 2:   // ��ü ���� ��� ��ȸ
					int totalScore = 0;
					
					for(int i =0; i<list.size(); i++) {
						totalScore = totalScore+list.get(i).getScore();
					}
					System.out.println("��ü ��� ���� : " + totalScore/list.size());
					break;
				case 3:   //  �ְ� ����
					int max = list.get(0).getScore();
					String maxName = "";
					
					for(int i=0; i<list.size(); i++) {
						if(max<list.get(i).getScore()) {
							max = list.get(i).getScore();
						}
					}
					System.out.println("�̸� : " + maxName);
					System.out.println("�ְ� ���� : " + max);
					
					break;
				case 4:   //  ���� ����
					int min = list.get(0).getScore();
					String minName = list.get(0).getName();
					
					//for-each �� ����ϱ�
					for(Students item : list) {
						
						if(min > item.getScore()) {
							min = item.getScore();
							minName = item.getName();
						}
					}
					System.out.println("�̸� : " + minName);
					System.out.println("���� ���� : " + min);
					
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
