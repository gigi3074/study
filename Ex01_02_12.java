package Ex01_02;

public class Ex01_02_12 {

	public static void main(String[] args) {
		// 이상한 문자 만들기
		/*
		 	문자열 s는 한 개 이상의 단어로 구성되어 있습니다.
		 	각 단어는 하나 이상의 공백문자로 구분되어 있습니다.
		 	각 단어의 짝수번째 알파벳은 대문자로,
		 	홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수,
		 	solution을 완성하세요.
		 	
		 	문자열 전체의 짝/홀수 인덱스가 아니라, 단어(공백을 기준)별로 짝/홀수 인덱스를 판단해야합니다.
			첫 번째 글자는 0번째 인덱스로 보아 짝수번째 알파벳으로 처리해야 합니다.
			
		 */
		// 소문자랑 대문자 각각 나눔 > 짜르고 > 띄어쓰기는 버퍼로 넣기
		// 반복문으로 버퍼에 띄어쓰기랑 글자 차례대로 넣기
		String s = "  try   HELLO   world  ";
		s = s.toLowerCase();
		String c = s.toUpperCase();
		String answer = ""; // 출력값 "TrY HeLlO WoRlD"
		
		StringBuffer str = new StringBuffer();
		String [] name = s.split("");
		
		int count = 0;
		for(int i = 0; i < s.length(); i++) {
			if(name[i].equals(" ")) {
				count = 2;
				str.append(s.charAt(i));
				continue;
			}else if(count%2 == 0) {
				c = s.toUpperCase();
				str.append(c.charAt(i));
				System.out.println(i);
			}else {
				s.toLowerCase();
				str.append(s.charAt(i));
			}
			count++;
		}
		answer = str.toString();
		System.out.println(answer);
		
	}//main
}
