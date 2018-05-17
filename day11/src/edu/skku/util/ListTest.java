package edu.skku.util;

import java.util.ArrayList;
import java.util.List;

import edu.skku.java.cms.Bus;
import edu.skku.java.cms.Car;
import edu.skku.java.cms.Truck;

public class ListTest {

	public static void main(String[] args) {
		List<Car> c = new ArrayList<>(); //super타입이 오면 sub-class 다 담을 수 있다
		c.add(new Car("11가1111",5000));
		
		c.add(new Bus("99버9999",8100, 45));
		c.add(new Bus("88버8888",7500, 30));
		
		c.add(new Truck("22트2222",9000, 5));
		c.add(new Truck("44트4444",9500, 10));
		c.add(new Truck("65트6666",7200, 3));
		
		for(Car cc:c) {
			System.out.println(cc);//cc.toString();
		}
		
		System.out.println("========Bus List=======");
		for(Car car: c) {
			if(car instanceof Bus) {
				System.out.println(car);
			}
		}
		

		int sum=0;
		for(Car car: c) {
			if(car instanceof Bus) {
				Bus b = (Bus)car;
				sum=sum+b.getSeat();
			}
		}
		System.out.println("버스의 총 좌석 수: "+sum);
		
		System.out.println(c.get(0));
		c.remove(0);
		System.out.println(c.get(0));
	}

}
