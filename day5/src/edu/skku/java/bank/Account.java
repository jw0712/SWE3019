package edu.skku.java.bank;
//일반 통장
public class Account {
	private String num;//계좌번호
	private int password;//비밀번호
	private long balance;//잔액
	
	
	//생성자
	public Account() {
		super();
	}
	
	public Account(String num, int password, long balance) {
		//super();
		//set 메서드를 이용해서 규격에 맞춰서 들어왔는지 체크하면 견고한 코드.
		setNum(num);
		setPassword(password);
		setBalance(balance);
	}

	
	//입금
	public void deposit(int money) {
		balance += money;
	}
	//password check
	public boolean checkPassword(int password) {
		//return this.password.equals(password); //password가 문자열일 때
		return this.password==password;
	}
	//출금
	public void withdraw(int password, int money) {
		//1)비밀번호 확인 -> 2) 잔액 체크(잔액 이상 출금 불가)
		if (checkPassword(password) && balance>=money) {
			balance-=money; //balance=balance-money;
			System.out.println("정상 출금");
		}else {
			System.out.println("비밀번호 또는 잔액 부족");
		}
	}
	//마우스 오른쪽->Source->Setters and Getters
	//Setters&Getters
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	private int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [num=" + num + ", balance=" + balance + "]";
	}
	
	
}
