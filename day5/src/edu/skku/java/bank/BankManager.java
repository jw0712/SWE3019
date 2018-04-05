package edu.skku.java.bank;

public class BankManager {
	Account[] as = new Account[50];
	int index=0;

	
	
	public void add(Account a) {
		as[index]=a;
		index++;
	}
	//��ü ���
	public void search() {
		for(Account a:as) {
			System.out.println(a);
		}
	}
	//�̸��� ���� �Ķ���͸� �ٸ��� overloading (����Ÿ�� �������)
	public Account search(String num) {
		Account b = new Account();
		for(Account a:as) {
			if (a.getNum().equals(num)){
				return a;
			}
		}return b;
	}
	
	public void searchMinus() {
		for(Account a:as) {
			if(a instanceof Minus) {
				System.out.println(a);
			}
		}
	}
	
	public int getTotal() {
		int sum = 0;
		for(Account a:as) {
			sum+=a.getBalance();
		}return sum;
	}
}
