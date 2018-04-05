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
	
	//파라메터에 주어진 색상의 옷들을 찾아서 출력
	public void getColor(String color) {
		for(int i=0;i<index;i++) {
			if(ss[i].getColor().contains(color)) {
				System.out.println(ss[i]);
			}
		}
	}
	//파라메터로 주어진 상품번호의 옷을 찾아서 리턴
	public Shirt search(int num) {
		for(int i=0;i<index;i++) {
			if(ss[i].getNum()==num) {
				return ss[i];
			}
		}
		return null;
	}
	//파라메터의 셔츠를 구매
	public void buy(Shirt s) {
		//제품이 존재하는지
		Shirt sh= search(s.getNum());
		if(sh==null) {//존재하지 않으면  add() 호출
			add(s);
		}else {//존재하면 수량만 증가
			sh.setQuantity(sh.getQuantity()+s.getQuantity());
		}
	}
	//파라메터의 번호의 옷을 quantity 수량만큼 판매
	public void sell(int num, int quantity) {
		Shirt sh = search(num);
		if (sh!=null) {
			if(quantity<=sh.getQuantity()) {
				sh.setQuantity(sh.getQuantity()-quantity);
			}else {
				System.out.println("수량부족");
			}
		}else {
			System.out.println("상품번호가 존재하지 않습니다");
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

	

