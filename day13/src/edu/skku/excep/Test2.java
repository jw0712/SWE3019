package edu.skku.excep;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test2 {
	
	public void fileRead() throws FileNotFoundException {
		Scanner s = new Scanner(new File("data1.txt")); //checked Exception
		String msg=s.nextLine();
		System.out.println(msg);
	}

	public static void main(String[] args) throws FileNotFoundException {
		Test2 t = new Test2();
		t.fileRead();
	}

}
