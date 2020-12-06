package algorithm.sort;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = {2, 4, 3, 5, 1};
		int min;
		int minIdx;
		int tmp;
		
		for (int i = 0; i < arr.length; i++) {
			min = arr[i];
			minIdx = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < min) {
					min = arr[j];
					minIdx = j;
				}
			}
			
			tmp = arr[i];
			arr[i] = arr[minIdx];
			arr[minIdx] = tmp;
			
		}
		
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

}
