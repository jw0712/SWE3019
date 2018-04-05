package edu.skku.java.cms;

public class Test2 {

	public static void main(String[] args) {
		CarManager mgr = new CarManager();
		mgr.add(new Bus("11호1234",5000, 45));
		mgr.add(new Bus("33나2343", 9000, 15));
		mgr.add(new Truck("55소9783",7000,3));
		
		mgr.print();
		System.out.println("======Bus List======");
		mgr.busList();
		System.out.println("총 버스의 좌석 수: "+mgr.getBusSeats());
		System.out.println("5000만원 이상인 차량 수: "+mgr.getCount(5000));
		
		Car[] re = mgr.getCars(6000);
		// for-each 인덱스 없이 전부 다 돌리기
		for(Car c: re) { 
			System.out.println(c);
		}
		
		
	}

}
