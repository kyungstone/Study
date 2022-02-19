/**
 * 
 */
package Codility.Lesson2_Arrays;

import java.util.Arrays;

/**
 * @author kyungstone
 *
 */

/*
 * An array A consisting of N integers is given. Rotation of the array means
 * that each element is shifted right by one index, and the last element of the
 * array is moved to the first place. For example, the rotation of array A = [3,
 * 8, 9, 7, 6] is [6, 3, 8, 9, 7] (elements are shifted right by one index and 6
 * is moved to the first place).
 * 
 * The goal is to rotate array A K times; that is, each element of A will be
 * shifted to the right K times.
 * 
 * Write a function:
 * 
 * class Solution { public int[] solution(int[] A, int K); }
 * 
 * that, given an array A consisting of N integers and an integer K, returns the
 * array A rotated K times.
 * 
 * For example, given
 * 
 * A = [3, 8, 9, 7, 6] K = 3 the function should return [9, 7, 6, 3, 8]. Three
 * rotations were made:
 * 
 * [3, 8, 9, 7, 6] -> [6, 3, 8, 9, 7] [6, 3, 8, 9, 7] -> [7, 6, 3, 8, 9] [7, 6,
 * 3, 8, 9] -> [9, 7, 6, 3, 8] For another example, given
 * 
 * A = [0, 0, 0] K = 1 the function should return [0, 0, 0]
 * 
 * Given
 * 
 * A = [1, 2, 3, 4] K = 4 the function should return [1, 2, 3, 4]
 * 
 * Assume that:
 * 
 * N and K are integers within the range [0..100]; each element of array A is an
 * integer within the range [−1,000..1,000]. In your solution, focus on
 * correctness. The performance of your solution will not be the focus of the
 * assessment.
 * 
 * Copyright 2009–2022 by Codility Limited. All Rights Reserved. Unauthorized
 * copying, publication or disclosure prohibited.
 */
public class CyclicRotation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] A = {3, 8, 9, 7, 6};
		//int K = 3;
		
		int[] A = {1,2,3,4};
		int K = 4;
		
		//int[] A = {1};
		//int K = 0;
		
		//int[] A = {3, 2, 9, 7, 6};
		//int K = 7;
		
		CyclicRotation cyclicRotation = new CyclicRotation();
		Arrays.stream(cyclicRotation.solution(A, K)).forEach(num -> System.out.println(num));
	}
	
	public int[] solution(int[] A, int K) {
        // write your code in Java SE 8
		int[] answer = new int [A.length];
		if(A.length > 0) {
			K = K%A.length;
		}
		
		if(K > 0 && A.length > 1) {
			for(int i=0; i<A.length; i++) {
				answer[i] = A[Math.abs(A.length-K)];
				if(K == 1) {
					K = A.length;
				} else {
					K--;
				}
			}
		} else {
			answer = A;
		}
		
		
		return answer;
    }
}
