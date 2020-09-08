package array;

public class SearchArray {

	public static void main(String[] args) {
		
		int[] arr = {8, 16, 13, 2, 55, 42, 7};
		int searchVal = 7;
		
		int keyIdx = 0;
		
		for (keyIdx = 0; keyIdx < arr.length; keyIdx++) {
			if (arr[keyIdx] == searchVal) {
				break;
			}
		}
		
		if (keyIdx == arr.length) {
			System.out.println("not found");
		} else {
			System.out.println("IDX ====> " + keyIdx);
		}
		
	}

}
