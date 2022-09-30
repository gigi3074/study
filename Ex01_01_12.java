package ex01_01;

//class Solution {
//    public int solution(int n) {
//        int answer = 0;
//        return answer;
//    }
//}

public class Ex01_01_12 {

	public static void main(String[] args) {
		/*
		 	자연수 n이 매개변수로 주어집니다.
		 	n을 x로 나눈 나머지가 1이 되도록 하는
		 	가장 작은 자연수 x를 return 하도록 solution 함수를 완성해주세요.
		 	답이 항상 존재함은 증명될 수 있습니다.
		 	10을 3으로 나눈 나머지가 1이고,
		 	3보다 작은 자연수 중에서 문제의 조건을 만족하는 수가 없으므로,
		 	3을 return 해야 합니다.
		 	예
		 	n = 10 return = 3 
		 */
		int n = 10;	//입력값 출력값은 3이다.
		int re = 0;		//출력
		int i = 0;	// 나누는 값 & 최소값
//		나누기를 했을 때 몫이 1이 나오는데 그 중에 제일 작은 수
//		나누는 값은 n보다 클 수 없음
		for(i = 1; i <= n; i++) {
			if(n % i == 1) {
				re = i;
				break;
			}
		}
		System.out.println(re);
	}
}
