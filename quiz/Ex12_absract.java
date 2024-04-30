package kr.co.quiz;

public class Ex12_absract {

	public static void main(String[] args) {
		
	
		Ex12_1_book b = new Ex12_1_book("은식",15000,"나다"); 
		b.use();
		
		
		Ex12_1_pen p = new Ex12_1_pen("소연",12000,"너다");
		p.use();
		
		System.out.println(p.getColor());
			
		

	}

}
