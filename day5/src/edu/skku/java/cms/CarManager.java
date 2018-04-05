package edu.skku.java.cms;

public class CarManager {
	Car[] cars = new Car[100];
	int index = 0;
	
	public void add(Car c) {
		cars[index]=c;
		index++;
	}
	
	public void print() {
		for(int i = 0; i<index; i++)
			System.out.println(cars[i]);//c.toString()
		
	}
	
	public void busList() {
		for(int i=0;i<index;i++)
			//cars[i]�� �޸𸮿� Bus�� �ִ°�
			if(cars[i] instanceof Bus) //instanceof subclass (!superclass)
				System.out.println(cars[i]);
	}
	//������ �������� �� �¼� �� ���ؼ� �����ϱ�
	public int getBusSeats() {
		int sum=0;
		for(int i=0;i<index;i++) {
			if(cars[i] instanceof Bus) {
				Bus b = (Bus)cars[i];
				sum=sum+b.getSeat();
			}
		}return sum;
	}
	//������ ���� �� �Ķ���ͷ� ���޵� ���� �̻��� ������ ���� ���ϱ�
	public int getCount(int price) {
		int cnt=0;
		for(int i=0;i<index;i++) {
			if(cars[i].getPrice()>=price) {
				cnt = cnt+1;
			}
		}
		return cnt;
	}
	
	//������ ���� �� �Ķ���ͷ� ���޵� ���� �̻��� ������ ������ ���ؼ� ����
	public Car[] getCars(int price) {
		Car[] result = new Car[getCount(price)];
		int n = 0;
		for(int i=0;i<index;i++) {
			if(cars[i].getPrice()>=price) {
				result[n]=cars[i];
				n++;
				//result[n++]=cars[i]; �� �� ���� �̷��� �� �ٷ� ó���ص� ��.,
			}
		}return result;
	}
	
}
