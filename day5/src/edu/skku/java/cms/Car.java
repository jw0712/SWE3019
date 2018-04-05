package edu.skku.java.cms;

public class Car {
	private String num;
	private int price;             // 21억이 넘어가면 long 선언
	
	public Car() {
		//super();
	}
	
	public Car(String num, int price) {
		super();
		setNum(num);         //setNum의 함수에 올바르지 못한 숫자가 입력될 때를 거를 수 있음 -> 훨씬 더 좋은 코딩 기법
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
		System.out.println("출발~");
	}
	public void stop() {
		System.out.println("멈춤~");
	}

	@Override
	public String toString() {
		return "Car [num=" + num + ", price=" + price + "]";
	}
	
	
	
	
}
