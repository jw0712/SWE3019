package edu.skku.java.store;

public class StoreManager {
	Shirt[] wear = new Shirt[100];
	int index = 0;
	
	public void add(Shirt s) {
		wear[index]=s;
		index++;
	}
	
	public void print() {
		for(int i=0;i<index;i++) {
			System.out.println(wear[i]);
		}
	}
	
	public void shirtList() {
		for(int i=0;i<index;i++) {
			if(!(wear[i] instanceof Pants))
				System.out.println(wear[i]);
		}
	}
}
