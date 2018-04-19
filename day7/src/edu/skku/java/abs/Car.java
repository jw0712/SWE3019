package edu.skku.java.abs;

public abstract class Car {
	String num;
	int price;
	
	
	abstract void start(); //블럭이 아예 없는 것이 구현이 안된 것!
	
	void stop() {
		System.out.println("멈춤");
	}
	
}
