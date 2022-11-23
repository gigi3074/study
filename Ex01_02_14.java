package Ex01_02;

import java.util.Arrays;

public class Ex01_02_14 {

	public static void main(String[] args) {
		/*예산
		d는 부서별로 신청한 금액이 들어있는 배열이며, 길이(전체 부서의 개수)는 1 이상 100 이하입니다.
		d의 각 원소는 부서별로 신청한 금액을 나타내며, 부서별 신청 금액은 1 이상 100,000 이하의 자연수입니다.
		budget은 예산을 나타내며, 1 이상 10,000,000 이하의 자연수입니다.*/
		
		int[] d = {2,2,3,3};
		int budget = 10;
		int answer = 0;
		int num = 0;
		int count = 0;
		
		// 여러번 돌려서 경우의 수를 최대한 찾아내야됨.
		
		Arrays.sort(d); // 정렬 시키고...
		int ma = d[d.length-1];
//		System.out.println(ma);
//		System.out.println(Arrays.toString(d));
			
		for(int i = 0; i < d.length; i++) {
			if(budget>=(num+=d[i])) {
				count++;
//				System.out.println(num);
//				System.out.println(count);
			}
//			else if(budget >= (ma+=d[i])) {
//				count++;
//			}
			else {
				answer = count;
				break;
			}
		}
		answer = count;
		System.out.println(answer);
	}//main
}
