package edu.skku.excep;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {
	
	public void fileRead() {
		Scanner s=null;
		try {
		s = new Scanner(new File("data.txt")); //checked Exception
		String msg=s.nextLine();
		System.out.println(msg);
		}catch(FileNotFoundException e) {
			System.out.println("���� �б� ����");
		}finally {
			if(s!=null) s.close();
		}
	}

	public static void main(String[] args) {
		Test t = new Test();
		t.fileRead();
		
		
		
		
	}

}
