package edu.skku.java.cms2;

import java.util.ArrayList;
import java.util.List;

public class CarMgrImpl implements ICarMgr {
	List<Car> cars = new ArrayList<>();
//List<Car> cars = new ArrayList<>(100); //몇 개 쓸 지 모르겠지만 대충 100개 쓸 것 같은데

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
		}else{System.out.println("李⑤웾 踰덊샇 �삤瑜�");}

	}

	public void delete(String num) {
		Car c = search(num);
		if(c!=null) {
			cars.remove(c);
		}else{System.out.println("�삤瑜�");}

	}

}
