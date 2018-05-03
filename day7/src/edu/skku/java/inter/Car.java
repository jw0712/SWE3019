package edu.skku.java.inter;
//상수와 모두 구현되지 않은 메서드:interface
//리모콘! 이런게 있다는 것을 알려줄 목적

public interface Car {
	final int COUNT = 100; //public static final 
	int k = 5;//public static final 
	
	public abstract void start();
	void stop(); //public abstract
	//***이 메서드를 overriding 시에는 public void stop() {code};***
	

}
