package edu.skku.java.inter;
//����� ��� �������� ���� �޼���:interface
//������! �̷��� �ִٴ� ���� �˷��� ����

public interface Car {
	final int COUNT = 100; //public static final 
	int k = 5;//public static final 
	
	public abstract void start();
	void stop(); //public abstract
	//***�� �޼��带 overriding �ÿ��� public void stop() {code};***
	

}
