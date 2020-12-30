package study.stream;

import java.util.Arrays;
import java.util.List;

class Member {
	
	public static int MALE = 1;
	public static int FEMALE = 2;
	
	private String name;
	private int sex;
	private int age;
	
	public Member(String name, int sex, int age) {
		this.name = name;
		this.sex = sex;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}

public class StreamSample003 {

	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
				new Member("홍길동", Member.MALE, 30),
				new Member("박주임", Member.FEMALE, 33),
				new Member("최영근", Member.MALE, 29),
				new Member("오차장", Member.FEMALE, 37),
				new Member("김대리", Member.FEMALE, 30),
				new Member("이부장", Member.MALE, 49)
		);
		
		double avgAge = list.stream()
				.filter(member -> member.getSex() == Member.MALE)
				.mapToInt(Member :: getAge)
				.average()
				.getAsDouble();
		
		System.out.println("남자 평균 나이 : " + avgAge);
	}

}
