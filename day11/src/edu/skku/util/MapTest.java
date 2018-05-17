package edu.skku.util;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		Map<Integer, String> m = new HashMap<>();
		//key는 모두 달라야 함
		m.put(10000, "서울시 중구");
		m.put(10010, "서울시 동대문구");
		m.put(10020, "서울시 종로구");
		
		System.out.println(m.get(10010));
		
		for(Integer key:m.keySet()) {
			System.out.println(key+":"+m.get(key));
		}
	}

}

//셋 다 객체만 취급합니다.