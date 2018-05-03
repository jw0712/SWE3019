package edu.skku.lang;

public class StringTest {

	public static void main(String[] args) {
		String s = new String("Hello World"); //0~10
		String s2 = "abc";
		
		s=s+"d";

		//클래스이므로 메서드가 있음
		System.out.println(s.length());
		System.out.println(s.substring(6, 11));//6번째 문자부터~11번째 전까지
		System.out.println(s.substring(6, 10));
		System.out.println(s.substring(6)); //6번째부터 끝까지
		
		System.out.println(s.indexOf("W")); //6
		System.out.println(s.indexOf("Wor"));//6
		System.out.println(s.indexOf("Wol"));//-1 (못찾았어)
		
		System.out.println(s.startsWith("Hello")); //이걸로 시작하니
		System.out.println(s.endsWith("Hello")); //이걸로 끝나니
		
		System.out.println(s.toCharArray()); //Char[] 배열로 바꿔줌
		
		System.out.println(s.charAt(0)); //return Char (글자 하나)

	
	}

}
