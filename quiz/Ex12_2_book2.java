package kr.co.quiz;

public class Ex12_2_book2 implements Ex12_2_item2 {
	public String author;
	
	 public Ex12_2_book2(String name, double price, String author) {
		 this.author = author;
	 }
	  @Override
	  public void use() {
	    	System.out.println("å�� �н��ϴ�.");
	    }
	  
	  public String getAuthor() {
		  return author;
	  }
	
	

	

}
