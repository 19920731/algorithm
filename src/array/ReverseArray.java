package array;

public class ReverseArray {

	public static void main(String[] args) {
		
		int[] arr = {8, 16, 13, 2, 55, 42, 7};
		int[] reverseArr;
		
		System.out.println("\n--------------- Array -----------------");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		reverseArr = reverse(arr);
		
		System.out.println("\n--------------- Reverse ---------------");
		for (int i = 0; i < reverseArr.length; i++) {
			System.out.print(reverseArr[i] + " ");
		}
		
	}
	
	static int[] reverse(int[] num) {
		int temp;
		for (int i = 0; i < num.length / 2; i++) {
			temp = num[i];
			num[i] = num[num.length - i - 1];
			num[num.length - i - 1] = temp;
		}
		
		return num;
	}

}
