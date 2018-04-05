package edu.skku.java.store;

//한줄복사: Ctrl+alt+down방향키
//이동: alt+방향키
public class Test3 {
	public static void main(String[] args) {
		WearManagerImpl mgr = new WearManagerImpl();//Ctrl+Space=자동완성기능
		mgr.add(new Shirt(1001,90,"black,red",15000,10));
		mgr.add(new Shirt(2001,100,"yellow",35000,5));
		mgr.add(new Shirt(3001,90,"pink,black",85000,10));
		
		System.out.println("====allList=====");
		mgr.allList();
		System.out.println("=====getColor:black=====");
		mgr.getColor("black");
		System.out.println("=====getPrice=====");
		mgr.getPrice(20000);
		System.out.println("=====구매=====");
		mgr.buy(new Shirt(2001,100,"yellow",35000,3));
		mgr.buy(new Shirt(4001,100,"yellow,white",45000,5));
		mgr.allList();
		System.out.println("=====판매=====");
		mgr.sell(5001,10);
		mgr.sell(2001,10);
		mgr.sell(3001,10);
		mgr.allList();

		System.out.println("전체 제품 수: "+mgr.size());

		System.out.println("전체 재고 금액: "+mgr.getTotalPrice());
	}

}
