package edu.skku.java.store;

public class WearManagerImpl {
	Shirt[] ss = new Shirt[100];
	int index = 0;
	
	public void add(Shirt s) {
		ss[index]=s;
		index++;
	}
	
	public void allList() {
		for(int i=0 ; i<index; i++) {
			System.out.println(ss[i]);//ss[i].toString()
		}
	}

	public void getPrice(int price) {
		for (int i=0; i<index; i++) {
			if(ss[i].getPrice()<=price) {
				System.out.println(ss[i]);
			}
		}
	}
	
	//�Ķ���Ϳ� �־��� ������ �ʵ��� ã�Ƽ� ���
	public void getColor(String color) {
		for(int i=0;i<index;i++) {
			if(ss[i].getColor().contains(color)) {
				System.out.println(ss[i]);
			}
		}
	}
	//�Ķ���ͷ� �־��� ��ǰ��ȣ�� ���� ã�Ƽ� ����
	public Shirt search(int num) {
		for(int i=0;i<index;i++) {
			if(ss[i].getNum()==num) {
				return ss[i];
			}
		}
		return null;
	}
	//�Ķ������ ������ ����
	public void buy(Shirt s) {
		//��ǰ�� �����ϴ���
		Shirt sh= search(s.getNum());
		if(sh==null) {//�������� ������  add() ȣ��
			add(s);
		}else {//�����ϸ� ������ ����
			sh.setQuantity(sh.getQuantity()+s.getQuantity());
		}
	}
	//�Ķ������ ��ȣ�� ���� quantity ������ŭ �Ǹ�
	public void sell(int num, int quantity) {
		Shirt sh = search(num);
		if (sh!=null) {
			if(quantity<=sh.getQuantity()) {
				sh.setQuantity(sh.getQuantity()-quantity);
			}else {
				System.out.println("��������");
			}
		}else {
			System.out.println("��ǰ��ȣ�� �������� �ʽ��ϴ�");
		}
	}
	public int size() {
		return index;
	}
	public int getTotalPrice() {
		int total=0;
		for(int i=0;i<index;i++) {
			total= total+ss[i].getQuantity()*ss[i].getPrice();
			//total+=ss[i].getQuantity()*ss[i].getPrice();
		}
		return total;
	}
}

	

