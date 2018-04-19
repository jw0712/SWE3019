package edu.skku.java.cms;
//edu.skku.jave.cms.CarManager --> 마우스 오른쪽 --> Refactor --> Extract Interface
public interface ICarMgr {

	void add(Car c);

	void print();

	void busList();

	//소유한 버스들의 총 좌석 수 구해서 리턴하기
	int getBusSeats();

	//소유한 차들 중 파라메터로 전달된 가격 이상인 차들의 개수 구하기
	int getCount(int price);

	//소유한 차들 중 파라메터로 전달된 가격 이상인 차들의 정보를 구해서 리턴
	Car[] getCars(int price);

}