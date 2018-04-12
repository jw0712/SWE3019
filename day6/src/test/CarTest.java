package test;

public class CarTest {

	public static void main(String[] args) {
		//memory에 Bus, Car 같이 들어옴
		//그러므로 Car은 abstract class이지만, 앞에 올 수 있음 
		Car c = new Bus(); 
		
		
		//Bus의 start 실행
		c.start();
		
		//Car의 stop 실행 (Bus는 stop이 없음)
		c.stop(); 
	}

}
