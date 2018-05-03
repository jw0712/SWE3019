package edu.skku.lang;

public class Test {

	public static void main(String[] args) {
		Student s = new Student(1001, "kim");
		System.out.println(s);//s.toString(); ==> package.Classname@hashcode
		System.out.println(s.toString()); //F3
		System.out.println("------------------");
		//------------------------------------------------------------------------------
		Student s1 = new Student(1001, "kim");
		Student s2 = new Student(1001, "kim");
		if(s1==s2) System.out.println("s1==s2"); //같은 주소?
		
		//student에 equals를 만들어야 한다. overriding!
		if(s1.equals(s2)) System.out.println("s1 equals s2");

	}

}
