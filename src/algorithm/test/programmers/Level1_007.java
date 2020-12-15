package algorithm.test.programmers;

// 프로그래머스 > 연습문제 > 가운데 글자 가져오기
public class Level1_007 {

	public static String solution(String s) {
        StringBuffer sb = new StringBuffer(2);
		String answer = "";
		if (s.length() % 2 == 0) {
        	sb.append(s.charAt(s.length() / 2 - 1));
        	sb.append(s.charAt(s.length() / 2));
        } else {
        	sb.append(s.charAt(s.length() / 2));
        }
        
        answer = sb.toString();
        return answer;
    }

	public static void main(String[] args) {
		// String a = "abced";
		String a = "qwer";
		System.out.println(solution(a));
	}

}
