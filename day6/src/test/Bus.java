package test;

public class Bus extends Car {

	//������ ���� �������̵��ؼ� �޼��带 ��������� �մϴ�
	//superclass�� �� .. subclass�� �ݵ�� ���ƾ� ��
	//���� overriding
	@Override
	public void start() {
		System.out.println("���� ���");
	}

}
