package ex01_01;

class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        return answer;
    }
}


public class Ex01_01_08 {
	
	public static void main(String[] args) {
		
//		String[] temp = String.valueOf(num).split("");
//
//	    int sum = 0;
//	    for (String s : temp) {
//	        sum += Integer.parseInt(s);
//	    }
//
//	    if (num % sum == 0) {
//	            return true;
//	    } else {
//	      return false;
//	    }
		
		int i = 12;
		int cnt=0;
		boolean answer = true;
		
		String strNum = Integer.toString(i);
		int[] arrNum = new int[strNum.length()];
		for (int j = 0; j < strNum.length(); j++) {
			arrNum[j] = strNum.charAt(j) - '0';
			cnt += arrNum[j];
		}
		if(i%cnt == 0) {
			answer = true;
		}else {
			answer = false;
		}
		System.out.println(answer);
		
	}


}
