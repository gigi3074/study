package ex01_01;

public class Ex01_01_13 {

	public static void main(String[] args) {
		/*
		 	1-1. 입력된 수가 짝수라면 2로 나눕니다. 
			1-2. 입력된 수가 홀수라면 3을 곱하고 1을 더합니다. 
			2. 결과로 나온 수에 같은 작업을 1이 될 때까지 반복합니다.
			단, 주어진 수가 1인 경우에는 0을,
			작업을 500번 반복할 때까지 1이 되지 않는다면 –1을 반환해 주세요.
		 */
		int n = 626331; // 입력값
		int r = 0; // 출력값 예상 출력값 8
		int i = 0;
		if(n==1) r = 0;
//		for(i = 1; i <=500; i++) { // 500번 돌리는 식
//			if(n%2 == 0) { 	// 짝수면
//				n = n/2;	// 2를 나누고
////				System.out.print(n); 3 나옴
//				
//			}else if(n%2 == 1) {	// 홀수면
//				n = (n*3)+1;		// 3을 곱하고 1을 더한다.
////				System.out.println(n);	// 10나옴
//				
//			}else if(n == 1){
//				System.out.println(n); // 안나옴... 왜? while문으로 해본다.
//				break;
//			}
//			r = -1;
//		}
//
//		System.out.println(r);
			
		
		while(n != 1) {
			i++;
			if(n%2 == 0) { 	// 짝수면
				n = n/2;	// 2를 나누고
//				System.out.println(n); // 3 나옴	
			}else if(n%2 == 1) {	// 홀수면
				n = (n*3)+1;		// 3을 곱하고 1을 더한다.
//				System.out.println(n);	// 10나옴
				
			}else if(i == 500){
				r = -1;
//				System.out.println(r);
				break;
			}
			
			r = i;
		}
		System.out.println(r);
		
	}//main
}
