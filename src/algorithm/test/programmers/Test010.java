package algorithm.test.programmers;

import java.util.ArrayList;

// 프로그래머스 > 연습문제 > 같은 숫자는 싫어
public class Test010 {

	public static int[] solution(int[] arr) {
		int prevNum = -1;
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			if (prevNum != arr[i]) {
				list.add(arr[i]);
			}
			prevNum = arr[i];
		}
		
		System.out.println(list);
		
		int[] answer = new int[list.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
		return answer;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 1, 3, 3, 0, 1, 1 };
		// int[] arr = {4,4,4,3,3};
		solution(arr);
	}

}
