package algorithm.test.programmers;

// 프로그래머스 > 월간 코드 챌린지 시즌1 > 3진법 뒤집기
public class Level1_008 {

	public static int solution(int n) {
		int answer = 0;
		StringBuffer sb = new StringBuffer();

		while (n != 0) {
			sb.append(n % 3);
			n = n / 3;
		}

		// System.out.println("3진법 반전 : " + sb.toString());

		int multiples = 1;
		for (int i = sb.length() - 1; i >= 0; i--) {
			answer += (Integer.parseInt(sb.charAt(i) + "")) * multiples;
			multiples *= 3;
		}
		// System.out.println(answer);
		return answer;
	}

	public static void main(String[] args) {
		// int n = 45;
		int n = 125;

		System.out.println(solution(n));
	}

}
