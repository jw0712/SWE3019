package edu.skku.java.bank;

public class Minus extends Account {
	private int limit; //한도액
	
	
//생성자 Constructor
	public Minus() {
		super();
	}
	
	


	public Minus(String num, int password, long balance, int limit) {
		super(num, password, balance);
		setLimit(limit);
	}




//메서드, 오버라이드
	@Override
	public void withdraw(int password, int money) {
		if(checkPassword(password) && getBalance()+limit>=money) {
			setBalance(getBalance()-money); 
			System.out.println("마이너스 통장 정상 출금");
		}else {
			System.out.println("비밀번호 또는 잔액 부족");
		}
	}

	//Setter & Getter
	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}
	
	//inherited toString 붙여서 원래 계좌 정보에 한도액 합쳐서 리턴
	@Override
	public String toString() {
		return "Minus [" + super.toString() + ", limit=" + limit + "]";
	}
	

	
	
}
