package study.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Student2 implements Comparable<Student2> {
	
	private String name;
	private int score;
	
	public Student2(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getScore() {
		return score;
	}
	
	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public int compareTo(Student2 o) {
		return Integer.compare(score, o.score);
	}
	
	
}

public class StreamSample005 {

	public static void main(String[] args) {
		List<Student2> student = Arrays.asList(
				new Student2("홍길동", 90),
				new Student2("최영근", 95),
				new Student2("김자바", 100),
				new Student2("이객체", 80),
				new Student2("장스택", 77)
		);
		
		
		System.out.println("\n------- 점수 기준 오름차순 -------");
		student.stream()
				.sorted()
				.forEach(s -> System.out.println(s.getName() + " : " + s.getScore()));
		
		System.out.println("\n------- 점수 기준 내림차순 -------");
		student.stream()
				.sorted(Comparator.reverseOrder())
				.forEach(s -> System.out.println(s.getName() + " : " + s.getScore()));
		
		/*  Result
		 	------- 점수 기준 오름차순 -------
			장스택 : 77
			이객체 : 80
			홍길동 : 90
			최영근 : 95
			김자바 : 100
			
			------- 점수 기준 내림차순 -------
			김자바 : 100
			최영근 : 95
			홍길동 : 90
			이객체 : 80
			장스택 : 77		 
		 */
	}
	

}
