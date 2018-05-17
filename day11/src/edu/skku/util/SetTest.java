package edu.skku.util;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import edu.skku.java.cms.Car;

public class SetTest {

	public static void main(String[] args) {
	/*	Set s = new HashSet();
		s.add("abc");
		s.add(new Car());
		s.add("seoul");
		s.add("busan");
		s.add("busan");
		s.add(new Integer(30));
		for(Object obj:s) {
			System.out.println(obj);//obj.toString();
		*/
		
		//for(int i=0;i<s.size();i++) 순서가 없기 때문에 쓸 수 없음
		
		//Set<String> s = new HashSet<String>();
		//Set<String> s2 = new HashSet<>();//ver7.0
		Set<String> s = new TreeSet<String>(); //정렬되어 나옴.SortedSet 상속받음
		s.add("abc");
		s.add("seoul");
		//s.add(new Car().toString());
		s.add("busan");
		s.add("busan");
		s.add(30+"");
		//s.remove("abc");

	
		for(String obj:s) {
			System.out.println(obj);//obj.toString();
		}
		

	}

}
