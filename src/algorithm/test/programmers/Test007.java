package algorithm.test.programmers;

// 프로그래머스 > 연습문제 > 2016년
public class Test007 {

	public static String solution(int a, int b) {
		int[] day = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String[] dayOfWeek = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
		int sum = 0;
		for (int i = 0; i < a - 1; i++) {
			sum += day[i];
		}
		sum += b;
		
        String answer = "";
        answer = dayOfWeek[sum % 7];
        return answer;
    }

	public static void main(String[] args) {
		int a = 12;
		int b = 1;
		System.out.println(solution(a, b));
	}

}
