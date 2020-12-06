package array;

import java.util.Scanner;

public class MaxOfArray {

	public static void main(String[] args) {
		
		int[] num = new int[3];
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 수를 입력하세요 : ");
		num[0] = sc.nextInt();
		
		System.out.print("두번째 수를 입력하세요 : ");
		num[1] = sc.nextInt();
		
		System.out.print("세번째 수를 입력하세요 : ");
		num[2] = sc.nextInt();
		
		sc.close();
		
		System.out.println("MAX NUM : " + getMax(num));
		
	}
	
	static int getMax(int[] num) {
		int max = num[0];
		
		for(int i = 1; i < num.length; i++) {
 			if(num[i] > max) {
 				max = num[i];
 			}
		}
		
		return max;
	}

}
