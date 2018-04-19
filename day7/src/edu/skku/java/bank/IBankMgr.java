package edu.skku.java.bank;

public interface IBankMgr {

	void add(Account a);

	//전체 출력
	void search();

	//전체 출력
	//이름이 같고 파라메터만 다르면 overloading (리턴타입 상관없음)
	Account search(String num);

	void searchMinus();

	int getTotal();

	void deposit(String num, int money);

	void withdraw(String num, int password, int money);
	/*
	public void trans(String num, int password, int money, String tnum) {
		Account a = search(num);
		Account b = search(tnum);
		if(a!=null && b!=null) {
			a.withdraw(password, money);
			b.deposit(money);
		}else {
			System.out.println("계좌번호가 존재하지 않습니다.");
		}
		
	}*/

	void trans(String num, int password, int money, String tnum);

}