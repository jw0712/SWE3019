package test;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException {
		/*//어떤 클래스 내 메서드를 사용하고 싶으면, new하고 메서드를 부른다.
		Abc a = new Abc();
		a.m();
		a.m2(); //new>>static method 불러도 됨
		
		//static 메서드를 부를 때는 클래스이름.static메서드이름();
		Abc.m2();
		
		//
		Abc.k=10;
		System.out.println(Abc.k);
		System.out.println(a.k);
		
		Abc a2=new Abc();
		a2.k=40;
		System.out.println(Abc.k); */
		
		//클래스를 메모리에 로딩해주는 메서드인 forname이 있는 Class라는 클래스
		Class.forName("test.Abc");
		

	}

}
