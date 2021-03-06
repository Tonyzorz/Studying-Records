package interview.naver_line_2021.question1;

import java.util.*;

public class Question1_retry {

	/*
	 * 문제 설명
대학 신입생과 재학생이 일렬로 서있습니다. 이중 일부 학생을 선정해서 그룹을 만들려 합니다. 단, 그룹은 한 개만 만들어야 합니다. 학생을 선정하는 규칙은 다음과 같습니다.

그룹에 속한 학생들은 모두 좌, 우로 인접해서 서있어야 합니다. 즉, 그룹에 속한 학생들 사이에 그룹에 속하지 않은 학생이 서있으면 안 됩니다.
그룹에는 재학생이 정확히 k명 포함되어야 합니다.
그룹에 포함되는 신입생의 수에는 제한이 없습니다.
신입생이 포함되지 않아도 됩니다(즉, 재학생만으로 이루어진 그룹을 만들어도 괜찮습니다)
다음은 학생 4명이 일렬로 서있고, 그룹에 재학생이 1명(k = 1) 포함되어야 하는 경우의 예시입니다.

group_7.png

0은 신입생, 1은 재학생을 나타냅니다. 이때, 다음과 같이 조건에 맞게 그룹을 만들 수 있습니다.

group_3.png

위 6가지 경우 외에 재학생 1명이 반드시 포함되도록 그룹 한 개를 만드는 경우는 없습니다.

일렬로 서있는 학생들의 정보가 담긴 정수 배열 student, 그룹에 정확히 포함되어야 하는 재학생 수를 나타내는 정수 k가 매개변수로 주어집니다. 조건에 맞게 그룹 한 개를 만드는 방법은 모두 몇 가지인지 return 하도록 solution 함수를 완성해주세요.

제한사항
1 ≤ student의 길이 ≤ 100
0 ≤ student의 원소 ≤ 1
즉, student의 원소는 0 또는 1로만 이루어져 있습니다.
0은 신입생, 1은 재학생을 나타냅니다.
1 ≤ k ≤ 100
그룹을 하나도 만들지 못하는 경우 0을 return 해주세요.
입출력 예
student	k	result
[0,1,0,0]	1	6
[0, 1, 0, 0, 1, 1, 0]	2	8
[0, 1, 0]	2	0
입출력 예 설명
입출력 예 #1

문제의 예시와 같습니다.

입출력 예 #2

다음은 재학생 2명이 포함되도록 그룹을 만드는 몇 가지 예시입니다.

group_4.png

group_5.png

group_6.png

위 방법 외에도 5가지 방법이 더 있습니다. 따라서 재학생 2명이 포함되도록 그룹을 만드는 방법은 총 8가지입니다.

다음과 같은 방법은 올바르게 그룹을 만든 경우가 아닙니다.

그룹에는 재학생이 정확히 k명(여기서는 2명) 포함되어야 합니다. 아래 두 가지 예시에서는 재학생이 각각 3명, 1명 포함되어 있습니다.

group_8.png
group_9.png
그룹에 속한 학생들은 모두 인접해서 서있어야 하며, 그룹은 하나만 만들어야 합니다.

group_10.png
group_11.png
입출력 예 #3

재학생이 1명밖에 없으므로, 재학생이 2명 포함되도록 그룹을 만드는 방법은 없습니다.
	 */
	
	public Question1_retry() {
		// TODO Auto-generated constructor stub
	}
	
	public static boolean[] visited; 
    public static int answer = 0;
    
	public int solution(int[] student, int k) {
        visited = new boolean[student.length];

        for (int i = 0; i < student.length; i++) {
        	
        	if (student[i] == 1) {
        		visited[i] = true;
        		dfs(student, k, 1, 1);
        	}
        }
        
        return answer;
    }
    
    public static void dfs(int[] student, int k, int current, int count) {
    	
    	System.out.println("current === " + current + ":::: Arrays = " + Arrays.toString(visited));
    	if (current > student.length) {
    		return;
    	}
    	
    	if (count == k) {
    		answer++;
    	}
    	
    	for (int i = current - 1; i < student.length; i++) {
    		
    		if (!visited[i]) {
    			
    			visited[i] = true;
    			if (student[i] == 1) {
    				dfs(student, k, i + 1, count + 1);
    			} else {
    				dfs(student, k, i + 1, count);
    			}
    			visited[i] = false;
    		}
    	}
    }
    
	public static void main(String[] args) {
		Question1_retry solution = new Question1_retry();
		int[] student = {0,1,0,0};
		int k = 1;
//		int[] student = {0, 1, 0, 0, 1, 1, 0};
//		int k = 2;
		System.out.println(solution.solution(student, k));
	}
}
