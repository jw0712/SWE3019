package edu.skku.java.bank;

public class Test {
//클래스 쓰는 법 3가지 : new / 상속 / static 경우 클래스.메서드
	public static void main(String[] args) {
		BankManager mgr = new BankManager();
		mgr.add(new Account("11-111",1111,600000));
		mgr.add(new Minus("56-1233",2222,50000,100000));
		mgr.add(new Account("33-111",3333,10000));
		mgr.add(new Minus("12-3456",4444,150000,500000));
		mgr.search();
		System.out.println("11-111 검색: "+mgr.search("11-111"));
		mgr.searchMinus();
		System.out.println("전체 금액: "+mgr.getTotal());

	}

}
