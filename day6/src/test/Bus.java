package test;

public class Bus extends Car {

	//무조건 내가 오버라이딩해서 메서드를 정의해줘야 합니다
	//superclass의 빚 .. subclass가 반드시 갚아야 함
	//강제 overriding
	@Override
	public void start() {
		System.out.println("버스 출발");
	}

}
