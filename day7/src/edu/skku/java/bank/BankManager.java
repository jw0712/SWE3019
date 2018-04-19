package edu.skku.java.bank;

public class BankManager implements IBankMgr {
	Account[] as = new Account[50];
	int index=0;

	
	
	/* (non-Javadoc)
	 * @see edu.skku.java.bank.IBankMgr#add(edu.skku.java.bank.Account)
	 */
	@Override
	public void add(Account a) {
		as[index++]=a;
		//as[index]=a;
		//index++;
	}
	//전체 출력
	/* (non-Javadoc)
	 * @see edu.skku.java.bank.IBankMgr#search()
	 */
	@Override
	public void search() {
		for(int i=0;i<index;i++) {
			System.out.println(as[i]);//as[i].toString();
		}
	}
	//전체 출력
	//이름이 같고 파라메터만 다르면 overloading (리턴타입 상관없음)
	/* (non-Javadoc)
	 * @see edu.skku.java.bank.IBankMgr#search(java.lang.String)
	 */
	@Override
	public Account search(String num) {
		for(int i=0;i<index;i++) {
			//if(as[i].getNum().equals(num))
			if(num.equals(as[i].getNum())) 	return as[i];
		}return null;
	}
	
	/* (non-Javadoc)
	 * @see edu.skku.java.bank.IBankMgr#searchMinus()
	 */
	@Override
	public void searchMinus() {
		for(int i=0;i<index;i++) {
			if(as[i] instanceof Minus) {
				System.out.println(as[i]);
			}
		}
	}
	
	/* (non-Javadoc)
	 * @see edu.skku.java.bank.IBankMgr#getTotal()
	 */
	@Override
	public int getTotal() {
		int sum = 0;
		for(int i=0;i<index;i++) {
			sum+=as[i].getBalance();
		}return sum;
	}
	
	/* (non-Javadoc)
	 * @see edu.skku.java.bank.IBankMgr#deposit(java.lang.String, int)
	 */
	@Override
	public void deposit(String num, int money) {
		Account a = search(num);
		if (a==null) {
			System.out.println("계좌번호가 존재하지 않음");
			return; //이제 꺼져 !! Bye
		}
		a.deposit(money); //Account의 입금		
	}
	
	/* (non-Javadoc)
	 * @see edu.skku.java.bank.IBankMgr#withdraw(java.lang.String, int, int)
	 */
	@Override
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
	
	/* (non-Javadoc)
	 * @see edu.skku.java.bank.IBankMgr#trans(java.lang.String, int, int, java.lang.String)
	 */
	@Override
	public void trans(String num, int password, int money, String tnum) {
		withdraw(num, password, money);
		deposit(tnum, money); 
		//교수님 코드. 좋은 코드는 아님 (예외 처리가 안되기 때문)
	}
}

