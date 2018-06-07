package edu.skku.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class FileWriteObject {

	public static void main(String[] args) throws IOException {
		File f = new File("data.ob"); // sysout Object
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject("hello..");
		oos.writeObject("hola..");
		
		//oos.writeObject(new Customer());

		oos.close();
		fos.close();
		
		
	}

}
