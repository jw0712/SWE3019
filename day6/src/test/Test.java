package test;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException {
		/*//� Ŭ���� �� �޼��带 ����ϰ� ������, new�ϰ� �޼��带 �θ���.
		Abc a = new Abc();
		a.m();
		a.m2(); //new>>static method �ҷ��� ��
		
		//static �޼��带 �θ� ���� Ŭ�����̸�.static�޼����̸�();
		Abc.m2();
		
		//
		Abc.k=10;
		System.out.println(Abc.k);
		System.out.println(a.k);
		
		Abc a2=new Abc();
		a2.k=40;
		System.out.println(Abc.k); */
		
		//Ŭ������ �޸𸮿� �ε����ִ� �޼����� forname�� �ִ� Class��� Ŭ����
		Class.forName("test.Abc");
		
		//�ݿø�
		System.out.println(Math.round(34.56));
		
		//MathŬ���� �ڵ� ���� ������, Math���� Ŀ�� -> F3--> Attach.. --> jdk �ȿ� src.zip �ϸ� �ڵ� ����

	}

}
