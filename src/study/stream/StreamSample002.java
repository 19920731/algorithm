package study.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class Student {
	
	private String name;
	private int score;
	
	public Student(String name, int score) {
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
	
}

public class StreamSample002 {

	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
				new Student("홍길동", 95),
				new Student("최영근", 100),
				new Student("김대리", 100)
		);
		
		Stream<Student> stream = list.stream();
		stream.forEach(student -> {
			String name = student.getName();
			int score = student.getScore();
			System.out.println(name + " : " + score);
		});
	}

}
