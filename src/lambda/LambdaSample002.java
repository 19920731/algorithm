package lambda;

interface SquareFun {
	public abstract int Square(int num);	
}

public class LambdaSample002 {

	public static void main(String[] args) {
		/*
		 *  추상 메서드를 하나만 갖는 인터페이스를 자바 8부터는 함수형 인터페이스라고 하며,
		 *  이런 함수형 인터페이스만을 람다식으로 표현 가능하다.
		 */
		SquareFun sf1 = (int a) -> {
			return a * a;
		};		
		System.out.println(sf1.Square(1)); // 1
		
		
		/*
		 *  Square(int num)를 통해 a가 int일 수 밖에 없으므로 int를 생략할 수 있다.
		 */
		SquareFun sf2 = (a) -> {
			return a * a;
		};
		System.out.println(sf2.Square(2)); // 4
		
		
		/*
		 *  인자가 하나일 경우 소괄호도 생략 가능하다.
		 */
		SquareFun sf3 = a -> {
			return a * a;
		};
		System.out.println(sf3.Square(3)); // 9
		
		
		/*
		 *  로직이 한줄일 경우, 중괄호도 생략 가능하다.
		 *  다만, return구문을 생략해야한다.
		 */
		SquareFun sf4 = a -> a * a;
		System.out.println(sf4.Square(4)); // 16
		
	}

}
