package edu.skku.lang;

public class BuliderTest {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Hello World");
		
		sb.append("d");
		System.out.println(sb.length());
		
		sb.setLength(9);
		System.out.println(sb);
		
		sb.charAt(2);
		System.out.println(sb);
		
		sb.delete(0, 1);
		System.out.println(sb);
		
		sb.insert(2, "INSERT");
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
		// 수정될지 안될지 모르겠으면 CharSequence
		// 수정 안될거 같으면 String 
		// 수정 될거 같으면 StringBuilder
	}

}
