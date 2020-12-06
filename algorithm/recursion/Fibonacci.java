package recursion;

public class Fibonacci {

	public static int fibonacci(int n) {
		if (n < 2) {
			return 1;
		} else {
			return fibonacci(n - 2) + fibonacci(n - 1);
		}
	}
	
	public static void main(String[] args) {
		for (int i = 0; i < 20; i ++) {
			System.out.print(fibonacci(i) + " ");
		}
	}

}
