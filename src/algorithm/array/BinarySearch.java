package algorithm.array;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = {1, 15, 23, 29, 31, 38, 46, 78, 91};
		int key = 38;
		int pl = 0;
		int pr = arr.length - 1;
		int pc = 0;
		String result = "not found";
		
		do {
			pc = (pl + pr) / 2;
			
			if (arr[pc] == key) {
				result = "found";
				break;
			} else if (arr[pc] > key) {
				pr = pc - 1;
			} else {
				pl = pc + 1;
			}
			
		} while (pl <= pr);
		
		System.out.println("result : " + result);

	}

}
