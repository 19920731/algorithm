package algorithm.test.programmers;

import java.util.ArrayList;

// 프로그래머스 > 완전탐색 > 모의고사
public class Test005 {

	public static int[] solution(int[] answers) {
        int[] aPattern = {1, 2, 3, 4, 5};
		int[] bPattern = {2, 1, 2, 3, 2, 4, 2, 5};
		int[] cPattern = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};		
		int[] answerCnt = {0, 0, 0};
		
		for (int i = 0; i < answers.length; i++) {
			if (answers[i] == aPattern[i % 5]) {
				answerCnt[0]++;
			}
			if (answers[i] == bPattern[i % 8]) {
				answerCnt[1]++;
			}
			if (answers[i] == cPattern[i % 10]) {
				answerCnt[2]++;
			}			
		}
				
		int maxScore = Math.max(answerCnt[0], Math.max(answerCnt[1], answerCnt[2]));
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < answerCnt.length; i++) {
			if (answerCnt[i] == maxScore) {
				list.add(i + 1);
			}
		}
		
		int[] answer = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
		
        return answer;
    }

	public static void main(String[] args) {
		int[] answers = {1, 2, 3, 4, 5};
		// int[] answers = {1, 3, 2, 4, 2};

		solution(answers);
	}

}
