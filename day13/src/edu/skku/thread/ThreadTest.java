package edu.skku.thread;

public class ThreadTest {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());//현재 수행중인 스레드 이름 뭐지
		Thread t = new MyThread();
		t.start(); //cpu 스케줄러에게 등록
		System.out.println("Main...1");
		System.out.println("Main...2");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Main...3");
		System.out.println("Main...4");
		System.out.println("Main...5");
	
	}
}
class MyThread extends Thread{
	@Override
	public void run() {//알바생의 일
		System.out.println(Thread.currentThread().getName());
		System.out.println("I'm Part-timer!알바생");
	}
}
