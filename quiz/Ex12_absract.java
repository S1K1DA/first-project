package kr.co.quiz;

public class Ex12_absract {

	public static void main(String[] args) {
		
	
		Ex12_1_book b = new Ex12_1_book("����",15000,"����"); 
		b.use();
		
		
		Ex12_1_pen p = new Ex12_1_pen("�ҿ�",12000,"�ʴ�");
		p.use();
		
		System.out.println(p.getColor());
			
		

	}

}
