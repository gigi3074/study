package Ex01_02;

import java.util.Arrays;

public class Ex01_02_19 {

	public static void main(String[] args) {
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		int[] answer = new int[3]; // [5, 6, 3]
		int[] arr = array.clone();
		int a = 0;
		int b = 0;
		int c = 0;
		
		// 2차원 배열 
		for(int j = 0; j< commands.length; j++) {
				a = commands[j][0];
				b = commands[j][1];
				c = commands[j][2];
				arr = Arrays.copyOfRange(array,a-1,b);	// 짜르고
				Arrays.sort(arr);
				answer[j] = arr[c-1];
				System.out.println(answer[j]);
				
//				System.out.println(Arrays.toString(array));
		}

	}

}
