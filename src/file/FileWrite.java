package file;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class FileWrite {
	
	public static void main(String[] args) {
		String filePath = "C:\\Users\\choi\\Desktop\\file_test.txt";
		String str = "Hello world!";
		
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
		    writer.write(str);
		    writer.close();
		} catch (Exception e) {
			System.out.println(e);
		}
			
	}

}
