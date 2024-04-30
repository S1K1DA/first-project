package kr.co.quiz;

public class Ex12_1_book extends Ex12_1_item {
	public String author;
	
	 public Ex12_1_book(String name, double price, String author) {
		 super.name = name;
		 super.price = price;
		 this.author = author;
		 
	 }
	
	  @Override
	  public void use() {
	    	System.out.println("책을 읽습니다.");
	    }
	  
	  public void author() {
		  
	  }
	  
	  public String getAuthor() {
		  return author;
	  }
	
	

	

}
