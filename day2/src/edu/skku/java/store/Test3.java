package edu.skku.java.store;

//���ٺ���: Ctrl+alt+down����Ű
//�̵�: alt+����Ű
public class Test3 {
	public static void main(String[] args) {
		WearManagerImpl mgr = new WearManagerImpl();//Ctrl+Space=�ڵ��ϼ����
		mgr.add(new Shirt(1001,90,"black,red",15000,10));
		mgr.add(new Shirt(2001,100,"yellow",35000,5));
		mgr.add(new Shirt(3001,90,"pink,black",85000,10));
		
		System.out.println("====allList=====");
		mgr.allList();
		System.out.println("=====getColor:black=====");
		mgr.getColor("black");
		System.out.println("=====getPrice=====");
		mgr.getPrice(20000);
		System.out.println("=====����=====");
		mgr.buy(new Shirt(2001,100,"yellow",35000,3));
		mgr.buy(new Shirt(4001,100,"yellow,white",45000,5));
		mgr.allList();
		System.out.println("=====�Ǹ�=====");
		mgr.sell(5001,10);
		mgr.sell(2001,10);
		mgr.sell(3001,10);
		mgr.allList();

		System.out.println("��ü ��ǰ ��: "+mgr.size());

		System.out.println("��ü ��� �ݾ�: "+mgr.getTotalPrice());
	}

}
