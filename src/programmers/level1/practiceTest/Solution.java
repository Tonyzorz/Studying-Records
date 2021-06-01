package programmers.level1.practiceTest;

import java.util.*;

public class Solution {

	/*
	 * 문제 설명
	수포자는 수학을 포기한 사람의 준말입니다. 수포자 삼인방은 모의고사에 수학 문제를 전부 찍으려 합니다. 
	수포자는 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.
	
	1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
	2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5,   2, 1, 2, 3, 2, 4, 2, 5, ...
	3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5,   3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
	
	1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때, 
	가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성해주세요.
	
	제한 조건
	시험은 최대 10,000 문제로 구성되어있습니다.
	문제의 정답은 1, 2, 3, 4, 5중 하나입니다.
	가장 높은 점수를 받은 사람이 여럿일 경우, return하는 값을 오름차순 정렬해주세요.
	입출력 예
	answers	return
	[1,2,3,4,5]	[1]
	[1,3,2,4,2]	[1,2,3]
	입출력 예 설명
	입출력 예 #1
	
	수포자 1은 모든 문제를 맞혔습니다.
	수포자 2는 모든 문제를 틀렸습니다.
	수포자 3은 모든 문제를 틀렸습니다.
	따라서 가장 문제를 많이 맞힌 사람은 수포자 1입니다.
	
	입출력 예 #2
	
	모든 사람이 2문제씩을 맞췄습니다.
	 */
	public Solution() {
		// TODO Auto-generated constructor stub
	}
	
	public int[] solution(int[] answers) {
		//반복되는 패턴 찾아서 정답을 student# 배열에 담기 
        int[] student1 = {1, 2, 3, 4, 5}; //5
        int[] student2 = {2, 1, 2, 3, 2, 4, 2, 5}; //8
        int[] student3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}; //10

        //시험에 맞은 답의 수를 담기 
        int[] rightAns = new int[3];
        
        //문제가 맞을때 마다 맞은 답의 수++
        for(int i = 0; i < answers.length; i++) {
        	if(answers[i] == student1[i%5]) rightAns[0]++;
        	if(answers[i] == student2[i%8]) rightAns[1]++;
        	if(answers[i] == student3[i%10]) rightAns[2]++;
        }
        
        //최대 맞은수 찾기 
        int maxRight = rightAns[0];
        
        //첫번째 학생보다 맞은 정답수 비교 후 크면 담는 for 문
        for(int i = 1; i < rightAns.length; i++) {
        	if(maxRight < rightAns[i]) maxRight = rightAns[i];
        }
        
        //array는 방 크기를 고정으로 선언해야해서 list사용 
        ArrayList<Integer> arraylist = new ArrayList<>();
        
        //최대 맞은수 와 같으면 list에 추가 
        if(maxRight == rightAns[0]) arraylist.add(1);
        if(maxRight == rightAns[1]) arraylist.add(2);
        if(maxRight == rightAns[2]) arraylist.add(3);
        
        //answer 작성
        int[] answer = new int[arraylist.size()];
        
        Iterator<Integer> iterator = arraylist.iterator();
        
        for(int i = 0; i < answer.length; i++) {
        	answer[i] = iterator.next();
        }
        

        return answer;
    }
	
	/*
	 * answers	return
	[1,2,3,4,5]	[1]
	[1,3,2,4,2]	[1,2,3]
	 */
	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] nums = {1,2,3,4,5};
		System.out.println(Arrays.toString(solution.solution(nums)));
	}

}