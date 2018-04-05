package edu.skku.java.store;

public class Test3 {
//한줄복사 : ctrl+alt+방향키
//이동: alt+방향키
		
	public static void main(String[] args) {
		WearManagerImpl mgr=new WearManagerImpl();
		mgr.add(new Shirt(1001,90,"검정, 빨강",15000,10));
		mgr.add(new Shirt(2001,100,"노랑",15000,5));
		mgr.add(new Shirt(3001,90,"핑크, 검정",15000,10));
		mgr.allList();
		System.out.println("=========검정===========");
		mgr.getColor("검정");
		System.out.println("====가격: 20000원=======");
		mgr.getPrice(20000);
		System.out.println("======구매 :============");
		mgr.buy(new Shirt(2001,100,"노랑",35000,3));
		mgr.buy(new Shirt(4001,105,"노랑,하양",45000,5));
		mgr.allList();
		System.out.println("======판매:=============");
		mgr.sell(5001, 10);
		mgr.sell(2001, 10);
		mgr.sell(3001, 10);
		mgr.allList();
		System.out.println("======전체 제품수:"+mgr.size());
		System.out.println("======전체 재고금액:"+mgr.getTotalPrice());
		
	}


}
