package kr.co.quiz;
                       //인터페이스 상속시 implements
public class Ex12_2_pen2 implements Ex12_2_item2 {
	
	 public String color;
	
	 public Ex12_2_pen2(String name, double price, String color) {
		 this.color=color;
	 }
	  @Override
	  public void use() {
	    	System.out.println("펜으로 쓰기를 합니다.");
	    }
	  public String getColor() {
		  return color;
	  }
	
	

}
