package edu.skku.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class FileWrite {

	public static void main(String[] args) throws IOException {
		File f = new File("data.txt");
		FileOutputStream fos=new FileOutputStream(f);
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		bw.write("hello...");
		bw.write("nice to meet u...");
		bw.write("hola...");
		bw.close();
		osw.close();
		fos.close();
		


	}

}
