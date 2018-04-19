package edu.skku.java.bank;

public class Minus extends Account {
	private int limit; //�ѵ���
	
	
//������ Constructor
	public Minus() {
		super();
	}
	
	


	public Minus(String num, int password, long balance, int limit) {
		super(num, password, balance);
		setLimit(limit);
	}




//�޼���, �������̵�
	@Override
	public void withdraw(int password, int money) {
		if(checkPassword(password) && getBalance()+limit>=money) {
			setBalance(getBalance()-money); 
			System.out.println("���̳ʽ� ���� ���� ���");
		}else {
			System.out.println("��й�ȣ �Ǵ� �ܾ� ����");
		}
	}

	//Setter & Getter
	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}
	
	//inherited toString �ٿ��� ���� ���� ������ �ѵ��� ���ļ� ����
	@Override
	public String toString() {
		return "Minus [" + super.toString() + ", limit=" + limit + "]";
	}
	

	
	
}
