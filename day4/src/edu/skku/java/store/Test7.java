package edu.skku.java.store;

public class Test7 {

	public static void main(String[] args) {
		StoreManager mgr = new StoreManager();
		mgr.add(new Shirt(1001,90,"����, ����",15000,10));
		mgr.add(new Shirt(2001,100,"���",15000,5));
		mgr.add(new Shirt(3001,90,"��ũ, ����",15000,10));
		mgr.add(new Pants(1234,100,"����",25000,4,10));
		mgr.add(new Pants(3001,90,"��ũ,����",85000,4,10));

		mgr.print();
		System.out.println("===Shirt List====");
		mgr.shirtList();
	}

}
