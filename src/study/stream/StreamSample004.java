package study.stream;

import java.util.Arrays;
import java.util.List;

public class StreamSample004 {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("홍길동", "최영근", "김대리", "오차장", "김과장", "김부장", "이부장", "김대리");
		
		names.stream()
				.distinct() // 중복제거
				.forEach(name -> System.out.print(name + " ")); // 홍길동 최영근 김대리 오차장 김과장 김부장 이부장 
		
		System.out.println();
		
		names.stream()
				.filter(name -> name.startsWith("김")) // 필터링
				.forEach(name -> System.out.print(name + " ")); // 김대리 김과장 김부장 김대리
		
		System.out.println();
		
		names.stream()
				.distinct() // 중복제거
				.filter(name -> name.startsWith("김")) // 필터링
				.forEach(name -> System.out.print(name + " ")); // 김대리 김과장 김부장
	}

}
