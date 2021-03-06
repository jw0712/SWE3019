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
			//cars[i]의 메모리에 Bus가 있는가
			if(cars[i] instanceof Bus) //instanceof subclass (!superclass)
				System.out.println(cars[i]);
	}
	//소유한 버스들의 총 좌석 수 구해서 리턴하기
	public int getBusSeats() {
		int sum=0;
		for(int i=0;i<index;i++) {
			if(cars[i] instanceof Bus) {
				Bus b = (Bus)cars[i];
				sum=sum+b.getSeat();
			}
		}return sum;
	}
	//소유한 차들 중 파라메터로 전달된 가격 이상인 차들의 개수 구하기
	public int getCount(int price) {
		int cnt=0;
		for(int i=0;i<index;i++) {
			if(cars[i].getPrice()>=price) {
				cnt = cnt+1;
			}
		}
		return cnt;
	}
	
	//소유한 차들 중 파라메터로 전달된 가격 이상인 차들의 정보를 구해서 리턴
	public Car[] getCars(int price) {
		Car[] result = new Car[getCount(price)];
		int n = 0;
		for(int i=0;i<index;i++) {
			if(cars[i].getPrice()>=price) {
				result[n]=cars[i];
				n++;
				//result[n++]=cars[i]; 위 두 줄을 이렇게 한 줄로 처리해도 됨.,
			}
		}return result;
	}
	
}
