package edu.skku.java.bank;

public class Test {
//Ŭ���� ���� �� 3���� : new / ��� / static ��� Ŭ����.�޼���
	public static void main(String[] args) {
		BankManager mgr = new BankManager();
		mgr.add(new Account("11-111",1111,600000));
		mgr.add(new Minus("56-1233",2222,50000,100000));
		mgr.add(new Account("33-111",3333,10000));
		mgr.add(new Minus("12-3456",4444,150000,500000));
		System.out.println("======search=======");
		mgr.search();
		System.out.println("11-111 �˻�: "+mgr.search("11-111"));
		System.out.println("======search Minus=======");
		mgr.searchMinus();
		System.out.println("��ü �ݾ�: "+mgr.getTotal());

	}

}
