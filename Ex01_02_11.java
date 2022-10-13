package Ex01_02;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex01_02_11 {

	public static void main(String[] args) {
		// 같은 숫자는 싫어
		
		
		int []arr = {0,0,2,5};
		int num = -1;
		
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		
		for(int i = 0; i < arr.length; i++) {
				if(num != arr[i]) {
				arrList.add(arr[i]);
				num = arr[i];
			}
		}
		
		int[] answer = new int [arrList.size()]; // 출력값 [1,3,0,1]
		answer = arrList.stream().mapToInt(a->a).toArray();
		System.out.println(Arrays.toString(answer));
		

		
	}//main
}
