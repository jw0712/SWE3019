package test;

public abstract class Car {
	String num;
	int price;
	
	//나를 상속받을 subclass들의 start가 모두 각각 다를 것 같아!
	//일부러 override하라고 그냥 빈 곳으로 남겨둘래
	//그럼 Car c = new Car를 안해야함!!
	public abstract void start();
	
	public void stop() {
		System.out.println("멈춤");
	}
}
