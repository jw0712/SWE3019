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
	
	//�������̵忡�� �ٽ� ���ϴ� ������ �����ڰ� ���ų� Ŀ���ϰ�  �̸��� ���� �Ķ���Ͱ� ���� ����Ÿ���� ���ƾ� �Ѵ�
	@Override
	public String toString() {
		return "[Pants "+super.toString()+" len:"+len;
	}

}
