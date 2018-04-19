package edu.skku.java.inter;
//����� ��� �������� ���� �޼���:interface
//������! �̷��� �ִٴ� ���� �˷��� ����

public interface Car {
	final int COUNT = 100; //public static final 
	int k = 5;//public static final 
	
	public abstract void start();
	void stop(); //public abstract
	//***상속 & overriding 할 때 public void stop() {code};***
	

}
