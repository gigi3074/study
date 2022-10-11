package ex01_01;

import java.util.Arrays;

public class Ex01_01_20 {

	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,6,7,8,0};	// 입력
		int answer = 0;		// 출력 5 + 9 14
		int num = 0;
		
		for(int i = 0; i < numbers.length; i++) {
			num += numbers[i];
			answer = 45-num;
		}
		
		
	}// main
}
