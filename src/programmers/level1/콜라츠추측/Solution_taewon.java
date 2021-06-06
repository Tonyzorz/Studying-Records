package programmers.level1.콜라츠추측;

import java.util.*;

public class Solution_taewon {

	/*
	 * 콜라츠 추측
문제 설명
1937년 Collatz란 사람에 의해 제기된 이 추측은, 주어진 수가 1이 될때까지 다음 작업을 반복하면, 모든 수를 1로 만들 수 있다는 추측입니다. 작업은 다음과 같습니다.

1-1. 입력된 수가 짝수라면 2로 나눕니다. 
1-2. 입력된 수가 홀수라면 3을 곱하고 1을 더합니다.
2. 결과로 나온 수에 같은 작업을 1이 될 때까지 반복합니다.
예를 들어, 입력된 수가 6이라면 6→3→10→5→16→8→4→2→1 이 되어 총 8번 만에 1이 됩니다. 위 작업을 몇 번이나 반복해야하는지 반환하는 함수, solution을 완성해 주세요. 단, 작업을 500번을 반복해도 1이 되지 않는다면 –1을 반환해 주세요.

제한 사항
입력된 수, num은 1 이상 8000000 미만인 정수입니다.
입출력 예
n	result
6	8
16	4
626331	-1
입출력 예 설명
입출력 예 #1
문제의 설명과 같습니다.

입출력 예 #2
16 -> 8 -> 4 -> 2 -> 1 이되어 총 4번만에 1이 됩니다.

입출력 예 #3
626331은 500번을 시도해도 1이 되지 못하므로 -1을 리턴해야합니다.
	 */
	public Solution_taewon() {
		// TODO Auto-generated constructor stub
	}
	
    public int solution(int num) {
        return collatzConjecture(num, 0);
    }
    
    public int collatzConjecture(long num, int time) {
    	
    	//System.out.println("arrived will perform num = " + num + "  time = " + time);
    	if(num == 1) {
    		return time;
    	} else if (time == 500) {
    		return -1;
    	}

    	if(num % 2 == 0) {
    		num /=2;
    	} else {
    		num = (num * 3) + 1;
    	}
    	
    	time++;
    	
    	return num == 1 ? time : collatzConjecture(num, time);
    }
    
	public static void main(String[] args) {
		Solution_taewon solution = new Solution_taewon();
		int num = 1;
		System.out.println(solution.solution(num));
	}
}
