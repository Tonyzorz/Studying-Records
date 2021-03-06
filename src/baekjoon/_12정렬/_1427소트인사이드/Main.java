package baekjoon._12정렬._1427소트인사이드;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {

	/*
	 * https://www.acmicpc.net/problem/1427
	 * 
	 * 소트인사이드
		시간 제한	메모리 제한	제출	정답	맞은 사람	정답 비율
		2 초	128 MB	38947	23724	20015	61.407%
		문제
		배열을 정렬하는 것은 쉽다. 수가 주어지면, 그 수의 각 자리수를 내림차순으로 정렬해보자.
		
		입력
		첫째 줄에 정렬하고자하는 수 N이 주어진다. N은 1,000,000,000보다 작거나 같은 자연수이다.
		
		출력
		첫째 줄에 자리수를 내림차순으로 정렬한 수를 출력한다.
		
		예제 입력 1 
		2143
		예제 출력 1 
		4321
	 */
    public static void main (String[] args) throws NumberFormatException, IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	Scanner sc = new Scanner(System.in);

    	int num = Integer.parseInt(br.readLine());
    	Integer[] numbers = new Integer[String.valueOf(num).length()];
    	
    	for (int i = 0; i < numbers.length; i++) {
    		numbers[i] = num % 10;
    		num /= 10;
    	}
    	
    	Arrays.sort(numbers, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
    		
    	});
    	
    	for (int i : numbers) {
    		bw.write(String.valueOf(i));
    	}
    	
    	bw.flush();
    	
    }
    
}
