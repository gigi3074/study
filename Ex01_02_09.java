package Ex01_02;

public class Ex01_02_09 {

	public static void main(String[] args) {
//		직사각형 별찍기
//		이 문제에는 표준 입력으로 두 개의 정수 n과 m이 주어집니다.
//		별(*) 문자를 이용해 가로의 길이가 n, 세로의 길이가 m인 직사각형 형태를 출력해보세요.
		int n = 3;
        int m = 5;
		
        for(int i = 0; i < m; i++) {	// 길이
        	for(int j = 0; j < n;j++) {		// 옆으로...
        	System.out.print("*");
        	}
        	System.out.println();
        }
		
        System.out.println(n + m);
	}//main
}
