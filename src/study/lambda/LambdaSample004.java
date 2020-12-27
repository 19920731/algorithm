package study.lambda;

import java.util.Arrays;

public class LambdaSample004 {

	public static void main(String[] args) {
		Integer[] nums = {20, 13, 10, 5, 42, 33, 28, 19};
		
		// 기본 반복문
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 5 == 0) {
				System.out.println(nums[i] + "은 5의 배수입니다.");
			}
		}		
		System.out.println("----------------------");
		
		
		// Enhanced For
		for (int i : nums) {
			if (i % 5 == 0) {
				System.out.println(i + "은 5의 배수입니다.");
			}
		}		
		System.out.println("----------------------");
		
		
		// 컬렉션 스트림
		Arrays.stream(nums)
				.filter(num -> num % 5 == 0)
				.forEach(num -> System.out.println(num + "은 5의 배수입니다."));
		System.out.println("----------------------");
		
		
		// 정렬 후 출력
		Arrays.stream(nums).sorted().forEach(num -> System.out.println(num));				
	}

}
