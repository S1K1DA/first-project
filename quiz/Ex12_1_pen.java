package kr.co.quiz;

public class Ex12_1_pen extends Ex12_1_item {
	
	 public String color;
	
	 public Ex12_1_pen(String name, double price, String color) {
		 super.name = name;
		 super.price = price;
		 this.color = color;
		 
	 }
	
	  @Override
	  public void use() {
	    	System.out.println("펜으로 쓰기를 합니다.");
	    }
	  
	  public void color() {
		  
	  }
	  public String getColor() {
		  return color;
	  }
	
	

}
