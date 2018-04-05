package edu.skku.java.cms;

public class CarManager {
	Car[] cars = new Car[100];
	int index = 0;
	
	public void add(Car c) {
		cars[index]=c;
		index++;
	}
	
	public void print() {
		for(int i = 0; i<index; i++)
			System.out.println(cars[i]);//c.toString()
		
	}
	
	public void busList() {
		for(int i=0;i<index;i++)
			//cars[i]의 메모리에 Bus가 있는가
			if(cars[i] instanceof Bus) //instanceof subclass (!superclass)
				System.out.println(cars[i]);
	}
	
	public void notBusList() {
		for(int i=0;i<index;i++)
			if(!(cars[i] instanceof Bus))
				System.out.println(cars[i]);
	}
	
}
