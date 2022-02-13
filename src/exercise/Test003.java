/**
 * 
 */
package exercise;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author kyungstone
 *
 */
public class Test003 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String params = "abababab";
		//String params = "abcabcabd";
		String s = "abcde";
		String params = s;
		for(int i=0; i<100000; i++) {
			params += s;
		}
		
		Test003 t = new Test003();
		long start = System.currentTimeMillis();
		System.out.println("answer : " + t.solution(params));
		long end = System.currentTimeMillis();
		System.out.println("time : " + (end - start));
	}
	
	public int solution(String params) {
		int answer = 0;
		Queue<String> queue = new LinkedList<String>();
		//String[] sa = params.split("");
		Arrays.asList(params.split("")).forEach(c -> queue.add(c));
		/*
		 * for(int i=0; i<params.length(); i++) { queue.add(params.substring(i, i+1)); }
		 */
		
		for(int i=0; i<queue.size(); i++) {
			Queue<String> temp = new LinkedList<String>();
			temp.addAll(queue);
			String basic = "";
			for(int j=0; j<i+1; j++) {
				basic = basic + temp.poll();
			}
			//System.out.println("basic : " + basic);
			
			while(!temp.isEmpty()) {
				String target = "";
				for(int j=0; j<i+1; j++) {
					target = target + temp.poll();
				}
				//System.out.println("target : " + target);
				if(!basic.equals(target)) {
					break;
				}
			}
			
			if(temp.isEmpty()) {
				answer = basic.length();
				break;
			}
		}
		
		return answer;
	}
}