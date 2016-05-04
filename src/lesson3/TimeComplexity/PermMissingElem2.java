package lesson3.TimeComplexity;

import java.util.Arrays;

/**
 *  Correctness 100% - Performance 60% 
 */

public class PermMissingElem2 {

    public int solution(int[] A){
		
    	int N = A.length + 1;
	    int total = N * (N + 1) / 2; 
		int sum = Arrays.stream(A).sum(); 
		
		return (int) total - sum;
	} 
	
	public static void main(String[] args) {
	
		int[] A = {3, 2, 1, 5}; 
		int miss = new PermMissingElem2().solution(A);
		System.out.println(miss);

	}

}
