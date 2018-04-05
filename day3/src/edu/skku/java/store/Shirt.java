package edu.skku.java.store;

public class Shirt {      //private을 앞에 추가함으로써 encapsulation
	private int num;
	private int size;
	private String color;
	private int price;
	private int quantity;

	public Shirt(){} //기본생성자 default 생성자

	public Shirt(int num, int size, String color, int price, int quantity) {
		super();    //super가 없어도 컴파일러가 생성해준다.
		setNum(num);
		setSize(size);
		setColor(color);
		setPrice(price);
		setQuantity(quantity);
	}

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

	@Override
	public String toString() {
		return "Shirt [num=" + num + ", size=" + size + ", color=" + color + ", price=" + price + ", quantity="
				+ quantity + "]";
	}


	
	

}


