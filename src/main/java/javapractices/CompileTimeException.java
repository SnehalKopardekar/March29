package javapractices;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;

public class CompileTimeException {
	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, MalformedURLException {
		
		//IOException
		File File = new File("c:/text.txt");
		FileInputStream fileInputStream = new FileInputStream(File);
		Class.forName("");
		URL url = new URL("www.google.com");
		
		
	}

}
