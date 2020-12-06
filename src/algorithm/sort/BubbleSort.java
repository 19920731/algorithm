package algorithm.sort;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = {6, 4, 3, 7, 1, 9, 8};
		int tmp;
		
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					tmp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

}
