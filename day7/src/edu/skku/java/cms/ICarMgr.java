package edu.skku.java.cms;
//edu.skku.jave.cms.CarManager --> ���콺 ������ --> Refactor --> Extract Interface
public interface ICarMgr {

	void add(Car c);

	void print();

	void busList();

	//������ �������� �� �¼� �� ���ؼ� �����ϱ�
	int getBusSeats();

	//������ ���� �� �Ķ���ͷ� ���޵� ���� �̻��� ������ ���� ���ϱ�
	int getCount(int price);

	//������ ���� �� �Ķ���ͷ� ���޵� ���� �̻��� ������ ������ ���ؼ� ����
	Car[] getCars(int price);

}