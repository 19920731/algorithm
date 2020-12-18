package lambda;

interface SumIF {
	public abstract int sum(int num);	
}

public class LambdaSample003 {

	public static void main(String[] args) {
		// 메서드 인자로 람다식 참조 변수 사용
		SumIF sif = a -> a + 10;
		calc(sif); // 30
		
		// 메서드 인자로 람다식 사용
		calc(a -> a + 100); // 120
	}
	
	public static void calc(SumIF sif) {
		System.out.println(sif.sum(20));
	}

}
