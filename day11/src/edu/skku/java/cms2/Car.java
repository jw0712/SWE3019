package edu.skku.java.cms2;

public class Car {
	private String num;
	private int price;             // 21���� �Ѿ�� long ����
	
	public Car() {
		//super();
	}
	
	public Car(String num, int price) {
		super();
		setNum(num);         //setNum�� �Լ��� �ùٸ��� ���� ���ڰ� �Էµ� ���� �Ÿ� �� ���� -> �ξ� �� ���� �ڵ� ���
		this.price=price;
	}
	
	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void start() {
		System.out.println("���~");
	}
	public void stop() {
		System.out.println("����~");
	}

	@Override
	public String toString() {
		return "Car [num=" + num + ", price=" + price + "]";
	}
	
	
	
	
}
