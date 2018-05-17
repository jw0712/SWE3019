package edu.skku.java.cms2;

import java.util.ArrayList;
import java.util.List;

public class CarMgrImpl implements ICarMgr {
	List<Car> cars = new ArrayList<>();


	public void add(Car c) {
		cars.add(c);
	}

	public Car search(String num) {
		for(Car c:cars) {
			if(c.getNum().equals(num)) {
				return c;
			}
		}
		return null;
	}

	public List<Car> search() {
		return cars;
	}

	public void update(String num, int price) {
		Car c = search(num);
		if(c!=null) {
			c.setPrice(price);
		}else{System.out.println("차량 번호 오류");}

	}

	public void delete(String num) {
		Car c = search(num);
		if(c!=null) {
			cars.remove(c);
		}else{System.out.println("오류");}

	}

}
