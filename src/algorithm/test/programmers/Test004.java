package algorithm.test.programmers;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

// 프로그래머스 > 월간 코드 챌린지 시즌1 > 두 개 뽑아서 더하기
public class Test004 {

	public static int[] solution(int[] numbers) {
		HashSet<Integer> set = new HashSet<Integer>();

		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				set.add(numbers[i] + numbers[j]);
			}

		}
		
		int[] answer = new int[set.size()];
		Iterator<Integer> it = set.iterator();
		
		int idx = 0;
		while(it.hasNext()) {
			answer[idx] = it.next();
			idx++;
		}		
		
		Arrays.sort(answer);
		
		return answer;
	}

	public static void main(String[] args) {
		int[] numbers = {2, 1, 3, 4, 1};
		// int[] numbers = {5, 0, 2, 7};

		solution(numbers);
	}

}
