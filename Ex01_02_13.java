package Ex01_02;

public class Ex01_02_13 {

	public static void main(String[] args) {
		/*3진법 뒤집기
		자연수 n이 매개변수로 주어집니다.
		n을 3진법 상에서 앞뒤로 뒤집은 후,
		이를 다시 10진법으로 표현한 수를 return 하도록 solution 함수를 완성해주세요.*/
//		n을 10진법 > 3진법 > 3진법 뒤집기 > 10진법으로 바꿔줘야된다.
		
		int n = 45;
		int answer = 0; //출력 7
		
		//10진법 > 3진법
		String num = Integer.toString(n,3);
		System.out.println(num); // 3진법으로 나옴
		// 뒤집기
		StringBuffer sb = new StringBuffer();
		for(int i = num.length()-1; i >= 0; i--) {
			sb.append(num.charAt(i));
		}	
		// 3진법 > 10진법
		
		answer = Integer.parseInt(sb.toString(),3);
		System.out.println(answer);	// 10진법 출력 확인
		
	}//main
}
