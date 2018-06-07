package edu.skku.th;

public class ThreadTest1 {

	public static void main(String[] args) {
		Thread t  = new Alba();
		t.setPriority(9);
		t.start();
		System.out.println("Main...");
		System.out.println("Main...");
		System.out.println("Main...");
	}

}

class Alba extends Thread{
	@Override
	public void run() {
		System.out.println("alba...");
	}
}