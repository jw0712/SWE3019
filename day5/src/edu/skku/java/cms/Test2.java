package edu.skku.java.cms;

public class Test2 {

	public static void main(String[] args) {
		CarManager mgr = new CarManager();
		mgr.add(new Bus("11ȣ1234",5000, 45));
		mgr.add(new Bus("33��2343", 9000, 15));
		mgr.add(new Truck("55��9783",7000,3));
		
		mgr.print();
		System.out.println("======Bus List======");
		mgr.busList();
		System.out.println("�� ������ �¼� ��: "+mgr.getBusSeats());
		System.out.println("5000���� �̻��� ���� ��: "+mgr.getCount(5000));
		
		Car[] re = mgr.getCars(6000);
		// for-each �ε��� ���� ���� �� ������
		for(Car c: re) { 
			System.out.println(c);
		}
		
		
	}

}
