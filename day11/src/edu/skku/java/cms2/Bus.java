package edu.skku.java.cms2;

public class Bus extends Car {  //��ӹްڴٴ� ���� �ǹ�
	private int seat;
	
	public Bus() {
		super();         //��� �����Ϸ��� �־���
	}
	
	public Bus(String num, int price, int seat) {
		super(num, price);   //��ӹ��� ���� Ŭ������ ������ ȣ��
		this.seat = seat;
	}

	public int getSeat() {
		return seat;
	}

	public void setSeat(int seat) {
		this.seat = seat;
	}

	@Override   //������ �´��� üũ�����
	public String toString() {
		return "Bus [getNum()=" + getNum() + ", getPrice()=" + getPrice() + ", seat=" + seat + "]";
	}
	public void start() {
		System.out.println("���� ���~");   //����� ���� �� �ٽ� ���������Ƿ� �ٽ� ���� �� ���ȴ�. Overriding���
	}
}
