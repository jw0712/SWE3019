package test;

public abstract class Car {
	String num;
	int price;
	
	//���� ��ӹ��� subclass���� start�� ��� ���� �ٸ� �� ����!
	//�Ϻη� override�϶�� �׳� �� ������ ���ܵѷ�
	//�׷� Car c = new Car�� ���ؾ���!!
	public abstract void start();
	
	public void stop() {
		System.out.println("����");
	}
}
