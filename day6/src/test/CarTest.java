package test;

public class CarTest {

	public static void main(String[] args) {
		//memory�� Bus, Car ���� ����
		//�׷��Ƿ� Car�� abstract class������, �տ� �� �� ���� 
		Car c = new Bus(); 
		
		
		//Bus�� start ����
		c.start();
		
		//Car�� stop ���� (Bus�� stop�� ����)
		c.stop(); 
	}

}
