package study.stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class StreamSample001 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("홍길동", "최영근", "김인턴");
		
		// Iterator 사용
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		
		System.out.println();
		
		// Stream 사용
		Stream<String> stream = list.stream();
		stream.forEach(name -> System.out.print(name + " "));
	}

}
