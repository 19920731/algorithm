package file;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
public class CSVRead {
	
	public static void print(ArrayList<HashMap<String, String>> memberList, String sortType) {
		System.out.println("=== 회원정보 (" + sortType + ") ===");
		for (int i = 0; i < memberList.size(); i++) {
			System.out.println(memberList.get(i));
		}
	}

	public static void main(String[] args) {

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
			
			print(memberList, "정렬없음");
			
			// 이름순 정렬
			Collections.sort(memberList, new Comparator<HashMap<String, String>>() {
				@Override
				public int compare(HashMap<String, String> map1, HashMap<String, String> map2) {
					String name = (String) map1.get("memberName");
					String name2 = (String) map2.get("memberName");
					return name.compareTo(name2);
				}
			});
			
			print(memberList, "이름순");
			
			// 사원번호순 정렬
			Collections.sort(memberList, new Comparator<HashMap<String, String>>() {
				@Override
				public int compare(HashMap<String, String> map1, HashMap<String, String> map2) {
					String memberId1 = (String) map1.get("memberId");
					String memberId2 = (String) map2.get("memberId");
					return memberId1.compareTo(memberId2);
				}
			});
			
			print(memberList, "사원번호순");
			
		} catch (Exception e) {
			System.out.println(e.toString());
		} finally {
			try {
				in.close();
			} catch (IOException e) {
				System.out.println(e.toString());
			}
		}
	}

}
