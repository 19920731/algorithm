package study.label;

public class LabelSample {

	public static void main(String[] args) {
		
		// Label을 사용하지 않은 코드
		boolean isContinue = true;
		for (int i = 0; i < 5; i++) {
			System.out.print(i + " ");
			for (int j = 0; j < 5; j++) {
				if (i == 2) {
					isContinue = false;
				}
			}
			if (!isContinue) {
				break;
			}
		}
				
		System.out.println();
		
		// Label을 사용한 코드
		outerLoop: for (int i = 0; i < 5; i++) {
			System.out.print(i + " ");
			for (int j = 0; j < 5; j++) {
				if (i == 2) {
					break outerLoop;
				}
			}
		}
		
	}
}
