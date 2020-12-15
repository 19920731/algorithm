package algorithm.test.programmers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

// 프로그래머스 > 해시 > 완주하지 못한 선수
public class Level1_002 {

	public static String solution(String[] participant, String[] completion) {
		String answer = "";
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		int mapCheckCnt = 0;
		for (int i = 0; i < participant.length; i++) {
			mapCheckCnt = map.get(participant[i]) == null ? 0 : map.get(participant[i]);
			map.put(participant[i], ++mapCheckCnt);
		}
		
		for (int i = 0; i < completion.length; i++) {
			mapCheckCnt = map.get(completion[i]) == null ? 0 : map.get(completion[i]);
			map.put(completion[i], --mapCheckCnt);
		}

		Iterator<String> keys = map.keySet().iterator();
		String key;
		while (keys.hasNext()){
            key = keys.next();
            if (map.get(key) != 0) {
            	answer = key; 
            }
        }
		return answer;
		
//		String answer = "";
//		
//		Arrays.sort(participant);
//		Arrays.sort(completion);
//		
//		for (int i = 0; i < completion.length; i++) {
//			if (!participant[i].equals(completion[i])) {
//				answer = participant[i];
//				return answer;
//			}				
//		}
//		
//		answer = participant[participant.length - 1];
//		return answer;
		
	}

	public static void main(String[] args) {
		// String[] participant = {"leo", "kiki", "eden"};
		// String[] completion = {"eden", "kiki"};
		String[] participant = {"mislav", "stanko", "mislav", "ana"};
		String[] completion = {"stanko", "ana", "mislav"};

		System.out.println(solution(participant, completion));
	}

}
