package edu.skku.java.bank;

public class BankManager {
	Account[] as = new Account[50];
	int index=0;

	
	
	public void add(Account a) {
		as[index++]=a;
		//as[index]=a;
		//index++;
	}
	//전체 출력
	public void search() {
		for(int i=0;i<index;i++) {
			System.out.println(as[i]);//as[i].toString();
		}
	}
	//전체 출력
	//이름이 같고 파라메터만 다르면 overloading (리턴타입 상관없음)
	public Account search(String num) {
		for(int i=0;i<index;i++) {
			//if(as[i].getNum().equals(num))
			if(num.equals(as[i].getNum())) 	return as[i];
		}return null;
	}
	
	public void searchMinus() {
		for(int i=0;i<index;i++) {
			if(as[i] instanceof Minus) {
				System.out.println(as[i]);
			}
		}
	}
	
	public int getTotal() {
		int sum = 0;
		for(int i=0;i<index;i++) {
			sum+=as[i].getBalance();
		}return sum;
	}
	
	public void deposit(String num, int money) {
		Account a = search(num);
		if (a==null) {
			System.out.println("계좌번호가 존재하지 않음");
			return; //이제 꺼져 !! Bye
		}
		a.deposit(money); //Account의 입금		
	}
	
	public void withdraw(String num, int password, int money) {
		Account a = search(num);
		if(a!=null) {
			a.withdraw(password, money);
			
		}else {
			System.out.println("계좌번호가 존재하지 않습니다.");
		}
	}
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
	
	public void trans(String num, int password, int money, String tnum) {
		withdraw(num, password, money);
		deposit(tnum, money); 
		//교수님 코드. 좋은 코드는 아님 (예외 처리가 안되기 때문)
	}
}

