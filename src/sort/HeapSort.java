package sort;

import java.util.Arrays;

public class HeapSort {
	
	public static void heapSort(int[] arr) {
		maxHeap(arr);
		int tmp;
		for (int i = arr.length - 1; i > 0; i--) {
			tmp = arr[0];
			arr[0] = arr[i];
			arr[i] = tmp;
			heapify(arr, i, 0);
		}
	}
	
	 public static void maxHeap(int[] arr) {
        for (int i = arr.length / 2; i >= 0; i--) {
            heapify(arr, arr.length, i);
        }
    }

	public static void heapify(int[] arr, int size, int i) {
		int left = (i + 1) * 2 - 1;
		int right = (i + 1) * 2;
		int largest = i;
		if (left < size && arr[left] > arr[largest]) {
			largest = left;
		}
		if (right < size && arr[right] > arr[largest]) {
			largest = right;
		}
		if (largest != i) {
			int t = arr[i];
			arr[i] = arr[largest];
			arr[largest] = t;
			heapify(arr, size, largest);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 6, 4, 3, 7, 1, 9, 8 };
		heapSort(arr);

		System.out.println("arr : " + Arrays.toString(arr));
	}

}
