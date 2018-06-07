package edu.skku.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class FileReadObject {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File f = new File("data.ob");
		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream ois  = new ObjectInputStream(fis);
		System.out.println(ois.readObject()); //return:Object type
		System.out.println(ois.readObject());
		ois.close();
		fis.close();
		

		ObjectInputStream ois2  = new ObjectInputStream(
								new FileInputStream(
								new File("data.ob")));
		System.out.println(ois2.readObject());
		System.out.println(ois2.readObject());
		ois2.close();
		
		

	}

}
