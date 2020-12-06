package sort;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = {6, 4, 3, 7, 1, 9, 8};
		
		int tmp = 0;
		int j = 0;
		for (int i = 1; i < arr.length; i++) {
			tmp = arr[i];
			j = i - 1;
			while (j >= 0 && tmp < arr[j]) {
				arr[j + 1] = arr[j]; // 비교대상이 큰 경우 오른쪽으로 밀어냄
				j--;
			}
			arr[j + 1] = tmp;
		}
		
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

}
