package study.lambda;

class RunTest implements Runnable {
	@Override
	public void run() {
		System.out.println("기존 방식 호출!");
	}	
}

public class LambdaSample001 {

	public static void main(String[] args) {
		// 기존 방식
		RunTest r1 = new RunTest();
		r1.run();
		

		// 익명 클래스
		Runnable r2 = new Runnable() {			
			@Override
			public void run() {
				System.out.println("익명 클래스 호출!");
			}
		};		
		r2.run();

		
		// 람다
		Runnable r3 = () -> {
			System.out.println("람다 방식의 호출!");
		};		
		r3.run();
		
		// 람다 (코드 블록이 한줄인 경우, {} 생략 가능)
		Runnable r4 = () -> System.out.println("람다 방식의 호출2!");		
		r4.run();
	}

}
