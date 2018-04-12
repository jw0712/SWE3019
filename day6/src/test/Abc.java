package test;

public class Abc {
	
	static int k = 5 ;

	public void m() {
		System.out.println("Just Method: m");
	}
	
	public static void m2() {
		System.out.println("Static Method: m2");
	}
	/*
	//static block
	 static { //이름이 없으니까 클래스가 메모리에 올라가면 자동실행됨
		 System.out.println("Static Block");
		 
	 } */
	//용도: 메모리에 올라가는 순간 이 작업이 자동으로 실행되었으면 좋겠음 모음집
	static {
		System.out.println("메모리에 올려주시면 알아서 밑에 3가지를 다 함! static block");
		Abc a = new Abc();
		a.m();
		a.m2();
		a.m();
		System.out.println("메모리에 올려주시면 알아서 위 3가지를 다 함! static block");
	}
}
