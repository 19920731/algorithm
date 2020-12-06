package algorithm.recursion;

public class Euclid {
	
	public static int gcd(int p, int q) {
		if (q == 0) {
			return p;
		}
		return gcd(q, p % q);
	 }
	public static void main(String[] args) {
		int num1 = 18;
		int num2 = 27;
		
		System.out.println(gcd(num1, num2));
	}

}
