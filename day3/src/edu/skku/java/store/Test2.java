package edu.skku.java.store;
/*
 * package java.util;
 * 
 * public class Random{
 * 	public int nextInt(int su){}
 * 
 * 	public static void sm(){}            //Random.sm(); 이러한 방식으로 사용이 가능하다
 * 	} 
 */
import java.util.Random;     //package가 다르기 때문에 import를 해야한다.
public class Test2 {

	public static void main(String[] args) {
		Random r=new Random();    //java.util.Random r = new java.util.Random();
		for (int i=0; i<7; i++) {
		int su=r.nextInt(45)+1;     //0부터 44중 임의의 값 +1
		System.out.println(su);
		}
	}

}
