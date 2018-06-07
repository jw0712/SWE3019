package edu.skku.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class FileRead {

	public static void main(String[] args) throws IOException {
		File f = new File("data.txt");
		if(!(f.exists())) return;
		
		//scanner - following 3 lines already made
		FileInputStream fis=new FileInputStream(f);
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println(br.readLine());
		br.close();
		isr.close();
		fis.close();
		
		
		Scanner s = new Scanner(f);
		System.out.println(s.nextLine());


	}

}
