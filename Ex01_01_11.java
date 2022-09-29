package ex01_01;

public class Ex01_01_11 {

	public static void main(String[] args) {
		/*
		 	함수 solution은 정수 x와 자연수 n을 입력 받아,
		 	x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다.
		 	다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.
		 	x는 -10000000 이상, 10000000 이하인 정수입니다.
			n은 1000 이하인 자연수입니다.
			x 입력 2 n 입력 5 answer [2,4,6,8,10]
		 */
		int x = -4;	//입력 1
		int n = 2;	//입력 2
		int i = 0;
		int sum = 0;
		long arr[]; 	// 출력	
		
		for(i = 0; i < n; i++){
			arr = new long[n];
			sum += (long)x;
            arr[i] = (long)sum;
            
            System.out.println(arr[i]);
        }
		
		arr = new long[n];
		while(i < n){
            sum += x;
            arr[i] = sum;
            i++;
        }
		
		
	}//main
}
