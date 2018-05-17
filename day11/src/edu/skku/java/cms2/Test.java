package edu.skku.java.cms2;

import java.util.List;

public class Test {

	public static void main(String[] args) {
		ICarMgr mgr = new CarMgrImpl();
		mgr.add(new Car("11차1111",5000));
		mgr.add(new Car("22차1111",5200));
		mgr.add(new Bus("33버1111",6000,20));
		mgr.add(new Bus("44버4444",4000,40));
		mgr.add(new Bus("55버5555",9900,10));
		mgr.add(new Truck("66트6666",5880,1));
		mgr.add(new Truck("77트7777",7550,2.5));
		mgr.add(new Truck("88트8888",6100,5));
		mgr.update("11차1111", 10000);
		mgr.delete("44버4444");

		
		
		List<Car> cars=mgr.search();
		for(Car c:cars) {
			System.out.println(c);
		}

	}

}
