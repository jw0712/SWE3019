package edu.skku.java.store;
/*
 * package java.util;
 * 
 * public class Random{
 * 	public int nextInt(int su){}
 * 
 * 	public static void sm(){}            //Random.sm(); �̷��� ������� ����� �����ϴ�
 * 	} 
 */
import java.util.Random;     //package�� �ٸ��� ������ import�� �ؾ��Ѵ�.
public class Test2 {

	public static void main(String[] args) {
		Random r=new Random();    //java.util.Random r = new java.util.Random();
		for (int i=0; i<7; i++) {
		int su=r.nextInt(45)+1;     //0���� 44�� ������ �� +1
		System.out.println(su);
		}
	}

}
