package javapractices;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileClass {

	public static void main(String[] args) throws IOException {
		
		File file = new File("C:/Users/Public/testing.txt");
		//file.createNewFile();
		//file.delete();
		
		System.out.println(file.length());
		
		FileWriter filewriter = new FileWriter(file);
		
		filewriter.write("Welcome to my new home");
		
		filewriter.close();
		System.out.println(file.length());
		
			
		FileReader filereader = new FileReader(file);
		
		int i;
		while((i=filereader.read())!=-1) {
			System.out.print((char)i);
			
			
		}
		filereader.close();
		System.out.println(file.getPath());
		System.out.println(file.canExecute());
		System.out.println(file.exists());
		System.out.println(file.getName());
		System.out.println(file.isFile());
		
		
		
		
		
	}
}
