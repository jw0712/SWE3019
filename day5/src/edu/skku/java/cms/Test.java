package edu.skku.java.cms;

public class Test {

	public static void main(String[] args) {
		Car c=new Car();
		Car c1=new Car("11³Ê1234",5000);
		Car c2=new Bus();
		Car c3=new Bus("44È£6543",8000,45);
		Car c4=new Truck("74³ë3645",9000,3);
		c.start();
		c1.start();
		c2.start();
		c3.start();
		c4.start();
		System.out.println(c);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);

	}

}
