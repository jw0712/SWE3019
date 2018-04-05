package edu.skku.java.cms;

public class Bus extends Car {  //상속받겠다는 것을 의미
	private int seat;
	
	public Bus() {
		super();         //업어도 컴파일러가 넣어줌
	}
	
	public Bus(String num, int price, int seat) {
		super(num, price);   //상속받은 슈퍼 클래스의 생성자 호출
		this.seat = seat;
	}

	public int getSeat() {
		return seat;
	}

	public void setSeat(int seat) {
		this.seat = seat;
	}

	@Override   //문법이 맞는지 체크해줘라
	public String toString() {
		return "Bus [getNum()=" + getNum() + ", getPrice()=" + getPrice() + ", seat=" + seat + "]";
	}
	public void start() {
		System.out.println("버스 출발~");   //상속을 받은 뒤 다시 정의했으므로 다시 만든 게 사용된다. Overriding기법
	}
}
