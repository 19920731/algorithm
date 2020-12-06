package sort;

import java.util.Arrays;

public class QuickSort {

	public static void quickSort(int arr[], int left, int right) {
		int i, j, pivot, tmp;
	    if (left < right) {
	        i = left;   j = right;
	        pivot = arr[(left + right) / 2];
	        // 분할
	        while (i < j) {
	            while (arr[j] > pivot) {
	            	j--;
	            }
	            
	            while (i < j && arr[i] < pivot) {
	            	i++;
	            }

	            tmp = arr[i];
	            arr[i] = arr[j];
	            arr[j] = tmp;
	        }
	        
	        // 정렬
	        quickSort(arr, left, i - 1);
	        quickSort(arr, i + 1, right);
	    }		
	}

	public static void main(String[] args) {
		int[] arr = { 6, 4, 3, 7, 1, 9, 8 }; 
		quickSort(arr, 0, arr.length - 1);
		
		System.out.println("arr : " + Arrays.toString(arr));
	}

}
