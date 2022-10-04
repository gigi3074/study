package ex01_01;

import java.util.Arrays;

public class Ex01_01_18 {

	public static void main(String[] args) {
		
		int [] arr = {4,3,2,1};
		
		if(arr.length == 1) {
			int answer[] = {-1};
			// return answer;
		}
		int answer[] = {arr.length-1};
		int min = Arrays.stream(arr).min().getAsInt();
		answer = Arrays.stream(arr).filter(i -> i > min).toArray();
				

		
		
	}//main
}
