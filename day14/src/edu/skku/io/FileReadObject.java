package edu.skku.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class FileReadObject {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File f = new File("data.ob");
		if(!(f.exists())) return;
		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream ois  = new ObjectInputStream(fis);
		System.out.println(ois.readObject()); //return:Object type
		System.out.println(ois.readObject());
		ois.close();
		fis.close();
		
		

	}

}
