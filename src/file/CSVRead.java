package file;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
public class CSVRead {

	public static void main(String[] args) throws IOException {

		String filePath = "C:\\Users\\choi\\dev\\git\\Java\\data\\member.csv";
		FileInputStream input = null;
		InputStreamReader reader = null;
		BufferedReader in = null;
		String memberData = "";
		ArrayList<HashMap<String, String>> memberList = new ArrayList<HashMap<String,String>>();
		HashMap<String, String> map = null;
		
		try {
			input = new FileInputStream(filePath);
			reader = new InputStreamReader(input, "UTF-8");
			in = new BufferedReader(reader);
		
			while ((memberData = in.readLine()) != null) {
				// System.out.println(memberData);
				map = new HashMap<String, String>();
				map.put("memberId", memberData.split(",")[0]);
				map.put("memberName", memberData.split(",")[1]);
				map.put("memberTel", memberData.split(",")[2]);
				
				memberList.add(map);
			}
			
			System.out.println(memberList);
			
		} catch (Exception e) {
			System.out.println(e.toString());
		} finally {
			in.close();
		}
	}

}
