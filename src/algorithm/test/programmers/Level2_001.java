package algorithm.test.programmers;

import java.util.Arrays;
import java.util.Comparator;

// 프로그래머스 > 정렬 > 가장 큰 수
public class Level2_001 {

	public static String solution(int[] numbers) {
		StringBuffer sb = new StringBuffer();
		String[] strArr = new String[numbers.length];

		for (int i = 0; i < numbers.length; i++) {
			strArr[i] = Integer.toString(numbers[i]);
		}

		Arrays.sort(strArr, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return (o2 + o1).compareTo(o1 + o2);
			}
		});

		if (strArr[0].startsWith("0")) {
			sb.append("0");
		} else {
			for (int j = 0; j < strArr.length; j++) {
				sb.append(strArr[j]);
			}
		}

		String answer = "";
		answer = sb.toString();
		return answer;
	}

	public static void main(String[] args) {
		// int[] array = {6, 10, 2};
		int[] array = { 3, 30, 34, 5, 9 };

		solution(array);
	}

}
