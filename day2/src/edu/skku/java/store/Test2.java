package edu.skku.java.store;

/*
 * package java.util;
 * 
 * public class Random{
 *   public int nextInt(int su){ <-static이 없기 때문에 반드시 new Random
 *   
 *   public static void sm(){}<-new 안해도 됨. static 있음.
 *  }
 */

import java.util.Random;
public class Test2 {

	public static void main(String[] args) {
		//Random.sm(); <-이런 식으로 사용 가능
		
		Random r = new Random();
		//java.util.Random r = new java.util.Random();
		for(int i=0;i<7;i++) {
			int su=r.nextInt(45)+1;//0~44 중 임의의 값+1
			System.out.println(su);
		}
		
	}

}
