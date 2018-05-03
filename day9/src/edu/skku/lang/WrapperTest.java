package edu.skku.lang;

public class WrapperTest {

	public static void main(String[] args) {
		String a = "123";
		int k = Integer.parseInt(a);
		System.out.println(k+20);
		
		String aa = k+"";
		
		Integer n = new Integer(30);
		Integer n2 = 30;
		int n3 = n+50; //n.intValue()+50;
		System.out.println(n3);
		
		Double d = new Double(3.456);
		Double d2 = 3.456; 
		double d3 = d+60; //d.doubleValue()+60;
		System.out.println(d3);
	}

}
