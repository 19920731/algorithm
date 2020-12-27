package study.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class Sort {

	public static void main(String[] args) {
		ArrayList<HashMap<String, Object>> list = new ArrayList<HashMap<String, Object>>();
		
		dataSet(list);
		
		System.out.println("========= 정렬 전 =========");
		dataPrintln(list);
		
		System.out.println("========= 이름순 =========");
		Collections.sort(list, new Comparator<HashMap<String, Object>>() {

			@Override
			public int compare(HashMap<String, Object> o1, HashMap<String, Object> o2) {
				String name1 = o1.get("name").toString();
				String name2 = o2.get("name").toString();
				return name1.compareTo(name2);
			}
		});
		dataPrintln(list);
		
		System.out.println("========= 나이순 =========");
		Collections.sort(list, new Comparator<HashMap<String, Object>>() {

			@Override
			public int compare(HashMap<String, Object> o1, HashMap<String, Object> o2) {
				int age1 = Integer.parseInt(o1.get("age").toString());
				int age2 = Integer.parseInt(o2.get("age").toString());
				return age1 > age2 ? 1 : -1;
			}
		});
		dataPrintln(list);
		
		System.out.println("========= 사번순 =========");
		Collections.sort(list, new Comparator<HashMap<String, Object>>() {

			@Override
			public int compare(HashMap<String, Object> o1, HashMap<String, Object> o2) {
				String id1 = o1.get("id").toString();
				String id2 = o2.get("id").toString();
				return id1.compareTo(id2);
			}
		});
		dataPrintln(list);
		
		System.out.println("========= 사번역순 =========");
		Collections.sort(list, new Comparator<HashMap<String, Object>>() {

			@Override
			public int compare(HashMap<String, Object> o1, HashMap<String, Object> o2) {
				String id1 = o1.get("id").toString();
				String id2 = o2.get("id").toString();
				return id2.compareTo(id1);
			}
		});
		dataPrintln(list);

	}
	
	public static void dataPrintln(ArrayList<HashMap<String, Object>> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).get("id") + ", " + list.get(i).get("name") + ", "  + list.get(i).get("age"));
		}
	}
	
	public static void dataSet(ArrayList<HashMap<String, Object>> list) {
		HashMap<String, Object> map = null;
		
		map = new HashMap<String, Object>();
		map.put("id", "0001");
		map.put("name", "홍사원");
		map.put("age", 24);
		list.add(map);
		
		map = new HashMap<String, Object>();
		map.put("id", "0002");
		map.put("name", "변대리");
		map.put("age", 32);
		list.add(map);
		
		map = new HashMap<String, Object>();
		map.put("id", "0003");
		map.put("name", "이주임");
		map.put("age", 29);
		list.add(map);
		
		map = new HashMap<String, Object>();
		map.put("id", "0004");
		map.put("name", "박과장");
		map.put("age", 38);
		list.add(map);
		
		map = new HashMap<String, Object>();
		map.put("id", "0005");
		map.put("name", "배부장");
		map.put("age", 51);
		list.add(map);
		
		map = new HashMap<String, Object>();
		map.put("id", "0006");
		map.put("name", "이과장");
		map.put("age", 31);
		list.add(map);
		
		map = new HashMap<String, Object>();
		map.put("id", "0007");
		map.put("name", "김차장");
		map.put("age", 37);
		list.add(map);
		
		map = new HashMap<String, Object>();
		map.put("id", "0008");
		map.put("name", "오과장");
		map.put("age", 33);
		list.add(map);
		
		map = new HashMap<String, Object>();
		map.put("id", "0009");
		map.put("name", "최대리");
		map.put("age", 27);
		list.add(map);
		
		map = new HashMap<String, Object>();
		map.put("id", "0010");
		map.put("name", "김인턴");
		map.put("age", 24);
		list.add(map);
		
		map = new HashMap<String, Object>();
		map.put("id", "0011");
		map.put("name", "박부장");
		map.put("age", 54);
		list.add(map);
		
	}

}
