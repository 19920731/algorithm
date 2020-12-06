package algorithm.test;

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
	
	public static int countBit2(int value) {
		int count = 0;
		while (value != 0) {
			if (value % 2 == 1) {
				count++;
			}
			value /= 2;
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
				// System.out.println("push : " + elements.get(i));
				stack.push(elements.get(i));
			} else {
				// System.out.println("add list");
				result.add(stack);
				
				stack = new Stack<Integer>();
				stack.push(elements.get(i));
				
				tmpSum = elements.get(i);
			}
			
			if (elements.size() - 1 == i) {
				// System.out.println("last add");
				result.add(stack);
			}
		}
		
		System.out.println("result : " + result);
		return result;
	}

	public static void main(String[] args) {
		int intNum = 7;
		System.out.println("intNum(Binary String) : " + Integer.toBinaryString(intNum));
		// 1번 문제 - 진수로 변환 후 1의 갯수 파악
		System.out.println(countBit(intNum));
		
		// 1번 문제(2) - 진수로 변환 후 1의 갯수 파악
		System.out.println(countBit2(intNum));
		
		// 2번 문제 - 중량이 20을 넘지않도록 물건 넣기
		doDo();
	}

}
