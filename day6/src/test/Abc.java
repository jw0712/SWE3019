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
	 static { //�̸��� �����ϱ� Ŭ������ �޸𸮿� �ö󰡸� �ڵ������
		 System.out.println("Static Block");
		 
	 } */
	//�뵵: �޸𸮿� �ö󰡴� ���� �� �۾��� �ڵ����� ����Ǿ����� ������ ������
	static {
		System.out.println("�޸𸮿� �÷��ֽø� �˾Ƽ� �ؿ� 3������ �� ��! static block");
		Abc a = new Abc();
		a.m();
		a.m2();
		a.m();
		System.out.println("�޸𸮿� �÷��ֽø� �˾Ƽ� �� 3������ �� ��! static block");
	}
}
