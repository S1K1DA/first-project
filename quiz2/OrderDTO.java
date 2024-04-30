package kr.co.quiz2;

public class OrderDTO {
	
	private String customerName;
	private int orderNumber;
	private String orderItem;
	
	public OrderDTO(String customerName, int orderNumber, String orderItem) {
		super();
		this.customerName = customerName;
		this.orderNumber = orderNumber;
		this.orderItem = orderItem;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getOrderItem() {
		return orderItem;
	}

	public void setOrderItem(String orderItem) {
		this.orderItem = orderItem;
	}
	
	
	

}
