package programmers.level2.전화번호목록;

import java.util.*;

public class Solution_taewon {

	/*
전화번호 목록
문제 설명
전화번호부에 적힌 전화번호 중, 한 번호가 다른 번호의 접두어인 경우가 있는지 확인하려 합니다.
전화번호가 다음과 같을 경우, 구조대 전화번호는 영석이의 전화번호의 접두사입니다.

구조대 : 119
박준영 : 97 674 223
지영석 : 11 9552 4421
전화번호부에 적힌 전화번호를 담은 배열 phone_book 이 solution 함수의 매개변수로 주어질 때, 
어떤 번호가 다른 번호의 접두어인 경우가 있으면 false를 그렇지 않으면 true를 return 
하도록 solution 함수를 작성해주세요.

제한 사항
phone_book의 길이는 1 이상 1,000,000 이하입니다.
각 전화번호의 길이는 1 이상 20 이하입니다.
같은 전화번호가 중복해서 들어있지 않습니다.
입출력 예제
phone_book	return
["119", "97674223", "1195524421"]	false
["123","456","789"]	true
["12","123","1235","567","88"]	false
입출력 예 설명
입출력 예 #1
앞에서 설명한 예와 같습니다.

입출력 예 #2
한 번호가 다른 번호의 접두사인 경우가 없으므로, 답은 true입니다.

입출력 예 #3
첫 번째 전화번호, “12”가 두 번째 전화번호 “123”의 접두사입니다. 따라서 답은 false입니다.

알림

2021년 3월 4일, 테스트 케이스가 변경되었습니다. 이로 인해 이전에 통과하던 코드가 더 이상 통과하지 않을 수 있습니다.
	 */
	public Solution_taewon() {
		// TODO Auto-generated constructor stub
	}
	
	//Runtime error, 효율 마지막 2개 못 끝냄 
	public boolean solution_runtimeerror(String[] phone_book) {
        boolean answer = true;
        ArrayList<String> phoneBook = new ArrayList<String>();

        for(int i = 0; i < phone_book.length; i++) {
        	phoneBook.add(phone_book[i]);
        }
        
        //Collections.sort(phoneBook, Collections.reverseOrder());
        Collections.sort(phoneBook, new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				//System.out.println("s1.length()   " + s1.length());
				//System.out.println("s2.length()   " + s2.length());
				return s2.length() - s1.length();
			}
        	
        });
        //System.out.println("sorted === " + phoneBook);
        for(int i = 0; i < phoneBook.size(); i++) {
        	
        	for(int j = i + 1; j < phoneBook.size(); j++) {
        		//System.out.println(phoneBook.get(i) +"   " + phoneBook.get(j));
        		//System.out.println(phoneBook.get(i).substring(0, phoneBook.get(j).length()) +"   " + phoneBook.get(j));
        		if(phoneBook.get(i).substring(0, phoneBook.get(j).length()).contains(phoneBook.get(j))) {
        			answer = false;
        			return answer;
        		}
        	}
        }
        
        return answer;
    }
	
	public boolean solution(String[] phone_book) {
		Set<String> set = new HashSet<String>();
		
		for(String keys : phone_book) set.add(keys);
		
		for(String key : set) {
			for(int i = 1; i < key.length(); i++) {
				//System.out.println(key);
				if(set.contains(key.substring(0, i))) return false;
			}
		}
		
		return true;
	}


	public static void main(String[] args) {
		Solution_taewon solution = new Solution_taewon();
		String[] phone_book = {"119", "97674223","1195524421"};
		String[] phone_book1 = {"123","456","789"};
		String[] phone_book2 = {"12","123","1235","567","88"};
//		System.out.println("119123123".contains("119"));
		System.out.println(solution.solution(phone_book));
	}
}
