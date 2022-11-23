package Ex01_02;

import java.util.Arrays;

public class Ex01_02_17 {

	public static void main(String[] args) {
		// [[10, 7], [12, 3], [8, 15], [14, 7], [5, 15]]	120
		int sizes [][] ={{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}};
		int answer = 0;	// 120

	      	for(int i = 0; i < sizes.length; i++) {
	      		 // 5 8 10 12 14
				 // 15 15 7 3 7
	            Arrays.sort(sizes[i]);
	            // 7 3 8 7 5 
	            // 10 12 15 14 15
	        }
	        int max = sizes[0][0];
			int max1 = sizes[0][1];
	        for(int i = 0; i < sizes.length; i++) {
			  max = Math.max(max, sizes[i][0]);
			  max1 = Math.max(max1, sizes[i][1]);
	        }//for
		 
	        answer = max*max1;
		 System.out.println(answer);
		 
	}

	



}
