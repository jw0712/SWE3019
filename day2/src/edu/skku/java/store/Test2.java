package edu.skku.java.store;

/*
 * package java.util;
 * 
 * public class Random{
 *   public int nextInt(int su){ <-static�� ���� ������ �ݵ�� new Random
 *   
 *   public static void sm(){}<-new ���ص� ��. static ����.
 *  }
 */

import java.util.Random;
public class Test2 {

	public static void main(String[] args) {
		//Random.sm(); <-�̷� ������ ��� ����
		
		Random r = new Random();
		//java.util.Random r = new java.util.Random();
		for(int i=0;i<7;i++) {
			int su=r.nextInt(45)+1;//0~44 �� ������ ��+1
			System.out.println(su);
		}
		
	}

}
