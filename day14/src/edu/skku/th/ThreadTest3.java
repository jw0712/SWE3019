package edu.skku.th;

public class ThreadTest3 {

	public static void main(String[] args) {
		
		Thread t  = new Thread(new Runnable() {
			public void run() {
				System.out.println("albababbaa~! with new Runnable");
			}
		}); 
		
		t.start();
		System.out.println("Main...");

	}

}
/*
class Work implements Runnable{
	@Override
	public void run() {
		System.out.println("alba...");
	}
}
//Runnable = show part-timer's job*/

 