package edu.skku.java.store;
//마우스오른쪽->Source
public class Shirt {
	//Encapsulation
	private int num;
	private int size;
	private String color;
	private int price;
	private int quantity;
	
	//기본 생성자
	public Shirt() {
		super();
	}

	//생성자2
	public Shirt(int num, int size, String color, int price, int quantity) {
		super();
		this.num = num;
		this.size = size;
		this.color = color;
		this.price = price;
		this.quantity = quantity;
	}

	//Getters and Setters
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	

	//toString
	@Override
	public String toString() {
		return "Shirt [num=" + num + ", size=" + size + ", color=" + color + ", price=" + price + ", quantity="
				+ quantity + "]";
	}
	
}
