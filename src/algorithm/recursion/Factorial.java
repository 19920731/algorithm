package algorithm.recursion;

public class Factorial {

	public static int factorial(int n) {		
		if (n > 1) {
			System.out.print(n + " * ");
			return n * factorial(n - 1);
		} else {
			System.out.print("1 = ");
			return 1;
		}
	}
	
	public static void main(String[] args) {
		int num = 5;		
		System.out.print(num + "! = ");
		System.out.println(factorial(num));
	}

}
