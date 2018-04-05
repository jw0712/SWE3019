package edu.skku.java.store;

public class Test {

	public static void main(String[] args) {
		Shirt s = new Shirt();
		s.setNum(1101);
		s.setSize(90);
		s.setColor("red,blue");
		s.setPrice(5000);
		s.setQuantity(20);
		System.out.println(s);//s.toString()
		
		Shirt s2 = new Shirt(2001,100,"white",10000,10);
		System.out.println(s2);
	}

}
