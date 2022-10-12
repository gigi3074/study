package Ex01_02;

import java.util.Arrays;

public class Ex01_02_10 {

	public static void main(String[] args) {
//		최대공약수와 최소공배수
//		두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환하는 함수,
//		solution을 완성해 보세요.
//		배열의 맨 앞에 최대공약수, 그다음 최소공배수를 넣어 반환하면 됩니다.
//		예를 들어 두 수 3, 12의 최대공약수는 3,
//		최소공배수는 12이므로 solution(3, 12)는 [3, 12]를 반환해야 합니다.

//		최대공약수 공식 
//		최소공배수 식 > 최소공배수 = (숫자1*숫자2)/최대공약수 
		
		
		int n = 2;
		int m = 5;
		long max = 0;
		long min = 0;
		
		for(int i = 1; i <= n && i <= m; i++) { // 최대공약수
			if(n%i == 0 && m%i ==0 ) {
				max = i;	
			}
		}
		min = (n*m)/max; // 최소공배수 구하는 공식
		int[] answer = {(int)max,(int)min};	// 출력값 [1, 10]
		System.out.println(Arrays.toString(answer));
	}//main
}
