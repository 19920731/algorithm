package study.exception;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TryWithResources {

	public static void main(String[] args) {
		
		// Try-with-resources를 통한 자원 해제
		try (
	        FileInputStream fis = new FileInputStream("file.txt");
	        FileOutputStream fos = new FileOutputStream("file.txt")
	    ) {
	        // ..
	    } catch (IOException e) {
	        e.printStackTrace();
	    } finally {
	    	// close()를 명시적으로 호출해줄 필요가 없음.
		}

	}

}
