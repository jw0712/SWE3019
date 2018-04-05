package edu.skku.java.store;

public class Test6 {

	public static void main(String[] args) {
		Pants p=new Pants(1234,100,"검정",5000,4,10);   //memory pants와 shirt 모두 다 올라간다
		System.out.println(p);   // 마지막으로 정의된 pants의 toString을 print 한다

	}

}
