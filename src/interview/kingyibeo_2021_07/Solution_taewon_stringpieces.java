package interview.kingyibeo_2021_07;

import java.util.*;

public class Solution_taewon_stringpieces {

	/*
	 * 문제 설명
문자열 s가 주어질 때, s를 가능한 많은 개수의 "문자열 조각"으로 자르려 합니다. 단, 잘린 "문자열 조각"을 앞에서부터 순서대로 s(1), s(2), s(3), ..., s(n)이라고 했을 때, 다음 조건을 만족해야 합니다.

1 ≤ i ≤ (n+1)/2 인 모든 자연수 i에 대해서, s(i) = s(n - i + 1)
예를 들어 문자열 "abcxyasdfasdfxyabc"을 "abc", "xy", "asdf", "asdf", "xy", "abc"로 자르고, 각 문자열 조각을 순서대로 s1, s2, s3, s4, s5, s6이라고 하겠습니다.

"abc" = s1
"xy" = s2
"asdf" = s3
"asdf" = s4
"xy" = s5
"abc" = s6
이때, s1 = s6, s2 = s5, s3 = s4로 위 조건을 만족하며, 이보다 더 많은 개수의 "문자열 조각"으로 자르면서 조건을 만족하도록 하는 방법은 없습니다.

문자열 s가 매개변수로 주어질 때, 조건에 맞게 s를 "문자열 조각"으로 자른 후 순서대로 배열에 담아 return 하도록 solution 함수를 완성해주세요.

제한사항
문자열 s의 길이는 1 이상 1,000 이하입니다.
s는 알파벳 소문자로만 이루어져 있습니다.
입출력 예
s	result
"abcxyasdfasdfxyabc"	["abc","xy","asdf","asdf","xy","abc"]
"abcxyqwertyxyabc"	["abc","xy","qwerty","xy","abc"]
"abcabcabcabc"	["abc","abc","abc","abc"]
"llttaattll"	["l","l","t","t","a","a","t","t","l","l"]
"zzzzzz"	["z","z","z","z","z","z"]
"abcdef"	["abcdef"]
입출력 예 설명
입출력 예 #1

문제 예시와 같습니다.

입출력 예 #2

문자열을 "abc", "xy", "qwerty", "xy", "abc"로 자르고, 각 문자열 조각을 순서대로 s1, s2, s3, s4, s5라고 하면 s1 = s5, s2 = s4, s3 = s3를 만족합니다. 이보다 더 많은 개수의 "문자열 조각"으로 자르면서 조건을 만족하도록 하는 방법은 없으므로, ["abc","xy","qwerty","xy","abc"]를 return 합니다.

입출력 예 #3

문자열을 "abc", "abc", "abc", "abc"로 자르고, 각 문자열 조각을 순서대로 s1, s2, s3, s4라고 하면 s1 = s4, s2 = s3를 만족하며, 이보다 더 많은 "문자열 조각"으로 자르면서 조건을 만족하도록 하는 방법은 없습니다.

만약 문자열을 "abcabc", "abcabc"로 자르고, 각 문자열 조각을 순서대로 s1, s2라고 하면 s1 = s2를 만족하지만, s를 가능한 많은 개수의 "문자열 조각"으로 잘라야 하므로 더 많은 조각으로 자른 ["abc","abc","abc","abc"]를 return 해야 합니다.

입출력 예 #4, #5, #6
	 */
	public Solution_taewon_stringpieces() {
		// TODO Auto-generated constructor stub
	}
	
	public String[] solution(String s) {
        
        StringBuilder ascend = new StringBuilder();
        StringBuilder descend = new StringBuilder();
        ArrayList<String> words = new ArrayList<>();
        
        for (int i = 0; i < s.length(); i++) {
        	ascend.append(s.charAt(i));
        	descend.append(s.charAt(s.length() - 1 - i));
        	
        	descend.reverse();
        	
        	if (ascend.toString().contentEquals(descend)) {
        		words.add(ascend.toString());
        		ascend.delete(0, ascend.length());
        		descend.delete(0, descend.length());
        	} else {
        		descend.reverse();
        	}
        }
        
        String[] answer = new String[words.size()];
        
        for (int i = 0; i < words.size(); i++) {
        	answer[i] = words.get(i);
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		Solution_taewon_stringpieces solution = new Solution_taewon_stringpieces();
		String s = "abcdef";
		System.out.println(solution.solution(s));
	}
}
