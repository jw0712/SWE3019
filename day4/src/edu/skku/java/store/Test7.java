package edu.skku.java.store;

public class Test7 {

	public static void main(String[] args) {
		StoreManager mgr = new StoreManager();
		mgr.add(new Shirt(1001,90,"검정, 빨강",15000,10));
		mgr.add(new Shirt(2001,100,"노랑",15000,5));
		mgr.add(new Shirt(3001,90,"핑크, 검정",15000,10));
		mgr.add(new Pants(1234,100,"검정",25000,4,10));
		mgr.add(new Pants(3001,90,"핑크,검정",85000,4,10));

		mgr.print();
		System.out.println("===Shirt List====");
		mgr.shirtList();
	}

}
