package edu.skku.java.abs;

public abstract class Car {
	String num;
	int price;
	
	
	abstract void start(); //���� �ƿ� ���� ���� ������ �ȵ� ��!
	
	void stop() {
		System.out.println("����");
	}
	
}
