package Inheritance;

public class InheritanceTest {

	public static void main(String[] args) {
		Person baby1 = new Person();
		baby1.walk(); // 뚜벅뚜벅
		
		Baby baby2 = new Baby();
		baby2.walk(); // 아장아장
		
		Person baby3 = new Baby();
		baby3.walk(); // 아장아장
		
		// Baby baby4 = new Person(); // Type mismatch: cannot convert from Person to Baby

	}

}
