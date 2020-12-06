package file;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonRead {

	public static void print(ArrayList<HashMap<String, String>> memberList, String sortType) {
		System.out.println("=== 회원정보 (" + sortType + ") ===");
		for (int i = 0; i < memberList.size(); i++) {
			System.out.println(memberList.get(i));
		}
	}
	
	public static void main(String[] args) {
		String filePath = "C:\\Users\\choi\\dev\\git\\Java\\data\\memberJson.txt";
		ArrayList<HashMap<String, String>> memberList = new ArrayList<HashMap<String,String>>();
		HashMap<String, String> map = null;
		
		try {
			JSONParser parser = new JSONParser();
			Object obj = parser.parse(new FileReader(filePath));
			JSONObject jsonObject = (JSONObject)obj;
			String date = (String)jsonObject.get("date");
			System.out.println("date : " + date);
			
			// Array
			JSONArray memberArr = (JSONArray)jsonObject.get("member");
			JSONObject memberObj = null;
			for (int i = 0; i < memberArr.size(); i++) {
				memberObj = (JSONObject)memberArr.get(i);
				map = new HashMap<String, String>();
				map.put("memberId", (String)memberObj.get("memberId"));
				map.put("memberName", (String)memberObj.get("memberName"));
				map.put("memberTel", (String)memberObj.get("memberTel"));
				
				memberList.add(map);;
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
		}
	}

}
