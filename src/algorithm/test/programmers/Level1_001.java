package algorithm.test.programmers;
import java.util.Arrays;

// 프로그래머스 > 정렬 > K번째수
public class Level1_001 {

	public static int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];
		int[] tmp;
		int k = 0;
		
		for (int i = 0; i < commands.length; i++) {
			k = 0;
			tmp = new int[commands[i][1] - commands[i][0] + 1];
			
			for(int j = commands[i][0] - 1; j < commands[i][1]; j++) {
				tmp[k] = array[j];
				k++;
			}
		
			Arrays.sort(tmp);
		
			answer[i] = tmp[commands[i][2] - 1];			
		}
		
        return answer;
    }
	
	public static void main(String[] args) {
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		
		solution(array, commands);

	}

}
