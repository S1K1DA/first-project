package kr.co.quiz;

public abstract class Ex12_1_item {
	public String name;
	public double price;
	
	
	public Ex12_1_item() {}
	
	public Ex12_1_item(String name, double price) {
		this.name = name;
		this.price = price;
	}
	// use �߻�ȭ �޼ҵ�
    public abstract void use(); 
}
