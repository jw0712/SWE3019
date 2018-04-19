package edu.skku.java.bank;

public interface IBankMgr {

	void add(Account a);

	//��ü ���
	void search();

	//��ü ���
	//�̸��� ���� �Ķ���͸� �ٸ��� overloading (����Ÿ�� �������)
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
			System.out.println("���¹�ȣ�� �������� �ʽ��ϴ�.");
		}
		
	}*/

	void trans(String num, int password, int money, String tnum);

}