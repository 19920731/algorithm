package file;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class CSVRead {

	public static void main(String[] args) throws IOException {

		String filePath = "C:\\Users\\choi\\dev\\git\\Java\\src\\file\\member.csv";
		FileInputStream input = null;
		InputStreamReader reader = null;
		BufferedReader in = null;
		String memberData = "";
		
		try {
			input = new FileInputStream(filePath);
			reader = new InputStreamReader(input, "UTF-8");
			in = new BufferedReader(reader);
		
			while ((memberData = in.readLine()) != null) {
				System.out.println(memberData);
			}			
		} catch (Exception e) {
			System.out.println(e.toString());
		} finally {
			in.close();
		}
	}

}
