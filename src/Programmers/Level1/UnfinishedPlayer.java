/**
 * 
 */
package Programmers.Level1;

import java.util.HashMap;
import java.util.Map;

/**
 * @author kyungstone
 *
 */

/*
해시
완주하지 못한 선수
문제 설명
수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.

마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때, 완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.

제한사항
마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.
completion의 길이는 participant의 길이보다 1 작습니다.
참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
참가자 중에는 동명이인이 있을 수 있습니다.
입출력 예
participant	completion	return
["leo", "kiki", "eden"]	["eden", "kiki"]	"leo"
["marina", "josipa", "nikola", "vinko", "filipa"]	["josipa", "filipa", "marina", "nikola"]	"vinko"
["mislav", "stanko", "mislav", "ana"]	["stanko", "ana", "mislav"]	"mislav"
입출력 예 설명
예제 #1
"leo"는 참여자 명단에는 있지만, 완주자 명단에는 없기 때문에 완주하지 못했습니다.

예제 #2
"vinko"는 참여자 명단에는 있지만, 완주자 명단에는 없기 때문에 완주하지 못했습니다.

예제 #3
"mislav"는 참여자 명단에는 두 명이 있지만, 완주자 명단에는 한 명밖에 없기 때문에 한명은 완주하지 못했습니다.
https://programmers.co.kr/learn/courses/30/lessons/42576/solution_groups?language=java
*/
public class UnfinishedPlayer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String[] participant = {"leo", "kiki", "eden"};
		//String[] completion = {"eden", "kiki"};
		
		//String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
		//String[] completion = {"josipa", "filipa", "marina", "nikola"};
		
		String[] participant = {"mislav", "stanko", "mislav", "ana"};
		String[] completion = {"stanko", "ana", "mislav"};
		
		System.out.println(UnfinishedPlayer.solution(participant, completion));
	}
	
	public static String solution(String[] participant, String[] completion) {
        String answer = "";
        
        Map<String, Integer> map = new HashMap<String, Integer>();
        for(String s:participant) {
        	map.put(s, map.getOrDefault(s, 0)+1);
        }
        for(String s:completion) {
        	map.put(s, map.get(s)-1);
        }
        
        for(String key:map.keySet()) {
        	if(map.get(key) > 0) {
        		answer = key;
                break;
        	}
        }
        
        return answer;
    }
}
