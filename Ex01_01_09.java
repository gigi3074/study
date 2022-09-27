package ex01_01;

import java.util.Arrays;
import java.util.Collections;

//class Solution {
//    public long solution(long n) { // 값을 받음 ex. 118372 
//        long answer = 0; // 리턴 ex. 873211
//        return answer;
//    }
//}

public class Ex01_01_09 {

	public static void main(String[] args) {
		long n = 118372; // 임의 수 
		long cnt = 0;	// 리턴
	
		String[] arr = String.valueOf(n).split(""); 	// long을 쪼개서 방에 넣음
		StringBuilder buffer = new StringBuilder();		// 이걸로 값을 쌓아줘야됨.
		
//		int arr[] = null;	// long 이라서 애는 필요없었음... 순간 착각함.
		for(int i = 0; i < arr.length; i++) {	// 방을 뒤적뒤적하기 위한 식
			Arrays.sort(arr, Collections.reverseOrder());	
			// sort로 정렬하는데 순서가 높은 것부터라서 collections.reverseOrder를 써서 반대로 뒤집어준다.
			buffer.append(arr[i]);
			// 차곡차곡 저장
		}
		cnt = Long.parseLong(buffer.toString());
		// buffer를 String으로 바꿔서 long으로 바꿈
		System.out.println(cnt);
		
	}

}
