package edu.skku.java.bank;
//�Ϲ� ����
public class Account {
	private String num;//���¹�ȣ
	private int password;//��й�ȣ
	private long balance;//�ܾ�
	
	
	//������
	public Account() {
		super();
	}
	
	public Account(String num, int password, long balance) {
		//super();
		//set �޼��带 �̿��ؼ� �԰ݿ� ���缭 ���Դ��� üũ�ϸ� �߰��� �ڵ�.
		setNum(num);
		setPassword(password);
		setBalance(balance);
	}

	
	//�Ա�
	public void deposit(int money) {
		balance += money;
	}
	//password check
	public boolean checkPassword(int password) {
		//return this.password.equals(password); //password�� ���ڿ��� ��
		return this.password==password;
	}
	//���
	public void withdraw(int password, int money) {
		//1)��й�ȣ Ȯ�� -> 2) �ܾ� üũ(�ܾ� �̻� ��� �Ұ�)
		if (checkPassword(password) && balance>=money) {
			balance-=money; //balance=balance-money;
			System.out.println("���� ���");
		}else {
			System.out.println("��й�ȣ �Ǵ� �ܾ� ����");
		}
	}
	//���콺 ������->Source->Setters and Getters
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
	public String toString() { //CharSequence로 리턴하는 게 더 좋다.
		StringBuilder builder = new StringBuilder();
		builder.append("Account [num=");
		builder.append(num);
		builder.append(", password=");
		builder.append(password);
		builder.append(", balance=");
		builder.append(balance);
		builder.append("]");
		return builder.toString();
	}
}

