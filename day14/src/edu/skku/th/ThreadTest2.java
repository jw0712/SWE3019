package edu.skku.th;

public class ThreadTest2 {

	public static void main(String[] args) {
		Thread t  = new Thread(new Work()); //already have part-timer
		t.start();
		System.out.println("Main...");

	}

}

class Work implements Runnable{
	@Override
	public void run() {
		System.out.println("new Work !!");
	}
}
//Runnable = show part-timer's job

 