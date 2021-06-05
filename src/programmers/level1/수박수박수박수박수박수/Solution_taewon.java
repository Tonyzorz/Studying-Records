package programmers.level1.수박수박수박수박수박수;

import java.util.*;

public class Solution_taewon {

	/*
	 * 수박수박수박수박수박수?
문제 설명
길이가 n이고, "수박수박수박수...."와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요. 예를들어 n이 4이면 "수박수박"을 리턴하고 3이라면 "수박수"를 리턴하면 됩니다.

제한 조건
n은 길이 10,000이하인 자연수입니다.
입출력 예
n	return
3	"수박수"
4	"수박수박"
	 */
	public Solution_taewon() {
		// TODO Auto-generated constructor stub
	}
	
	public String solution(int n) {
		StringBuffer answer = new StringBuffer();
		for(int i = 1; i <= n; i++) {
			if(i % 2 == 1) answer.append("수");
			else answer.append("박");
		}
        return answer.toString();
    }
	
	public static void main(String[] args) {
		Solution_taewon solution = new Solution_taewon();
		
	}
}
