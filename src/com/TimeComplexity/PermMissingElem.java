package com.TimeComplexity;

import java.util.Arrays;

/**
 *  Correctness 20% - Performance 80% 
 */
public class PermMissingElem {

	public int solution(int[] A){
		
		int miss = 1;
		if(A.length > 0){
			if(A.length == 1){
				miss = A[0] - 1; 
			}else{
				Arrays.sort(A);
				for(int i = 0; i < A.length - 1 ; i++){
					if(A[i] != A[i+1] - 1){
					  miss = A[i+1] - 1;
					  break;
					}
				}
			}
		}
		return miss;
	} 
	
	public static void main(String[] args) {
	
		int[] A = {}; 
		int miss = new PermMissingElem().solution(A);
		System.out.println(miss);

	}

}
