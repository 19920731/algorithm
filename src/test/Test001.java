package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Test001 {

	public static int countBit(int value) {
		int count = 0;
		while (value != 0) {
			count += (value & 1);
			value = value >>> 1;
		}

		return count;
	}

	public static List<Stack<Integer>> doDo() {
		final List<Integer> elements = Arrays.asList(9, 7, 6, 6, 4, 3, 4, 5, 3, 4, 3, 4, 1, 2);
		List<Stack<Integer>> result = new ArrayList<Stack<Integer>>();
		Stack<Integer> stack = new Stack<Integer>();

		int tmpSum = 0;
		for (int i = 0; i < elements.size(); i++) {
			tmpSum += elements.get(i);

			if (tmpSum < 20) {
				stack.add(elements.get(i));
			} else {
				tmpSum = 0;				
			}
			if (tmpSum == 0) {
				result.add(stack);				
				stack = new Stack<Integer>();
				i--;
			}
			
			if (i == 13) {
				result.add(stack);
				System.out.println(result);
			}
			
		}

		return result;
	}

	public static void main(String[] args) {
		// 1번 문제 - 진수로 변환 후 1의 갯수 파악
		System.out.println(countBit(15));
		
		// 2번 문제 - 중량이 20을 넘지않도록 물건 넣기
		doDo();
	}

}
