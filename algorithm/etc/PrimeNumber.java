package etc;

public class PrimeNumber {

	public static void main(String[] args) {
		
		boolean isPrime;
		
		for (int i = 2; i < 1000; i++) {
			isPrime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			
			if (isPrime) {
				System.out.println(i);
			}
		}
		
	}

}
