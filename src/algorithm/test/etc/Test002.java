package algorithm.test.etc;

import java.util.Arrays;

public class Test002 {

	// 1번 문제.
	public static int solution1(int N) {
        if (N == 1) {
			return 0;
		} else {
			int length = (int)(Math.log10(N));
			return (int)Math.pow(10, length);
		}
    }
	
	// 2번 문제.
	public static int solution2(int[] A) {
		int moveCnt = 0;
		Arrays.sort(A);

		for (int i = 0; i < A.length; i++) {
			int calcVal = (i + 1) - A[i];
			calcVal = calcVal < 0 ? -calcVal : calcVal;
			// System.out.println("i : " + (i + 1) + ", A : " + A[i] + ", calcVal : " + calcVal);
			moveCnt += calcVal;
		}
		
        return moveCnt;
    }
	
	public static void main(String[] args) {
		// 입력 값의 자릿수와 동일한 최소값 구하기
		System.out.println(solution1(125));
		
		// 최소 변경으로 중복되지 않는 배열로 만들기
		// Ex) 중복을 피하기 위해 2을 4로 변경할 경우, '2 -> 3 -> 4' 이므로 2번의 변경이 일어난 것으로 간주 
		int[] A = {1, 2, 3, 2};
		System.out.println(solution2(A));
	}

}
