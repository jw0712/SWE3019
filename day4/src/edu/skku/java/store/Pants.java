package edu.skku.java.store;

public class Pants extends Shirt {
	private int len;
	
	public Pants() {}

	public Pants(int num, int size, String color, int price, int quantity, int len) {
		super(num, size, color, price, quantity);
		setLen(len);
	}

	public double getLen() {
		return len;
	}

	public void setLen(int len) {
		this.len = len;
	}
	
	//오버라이드에서 다시 정하는 조건은 제한자가 같거나 커야하고  이름이 같고 파라미터가 같고 리턴타입이 같아야 한다
	@Override
	public String toString() {
		return "[Pants "+super.toString()+" len:"+len;
	}

}
