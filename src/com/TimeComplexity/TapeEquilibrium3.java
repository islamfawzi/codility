package com.TimeComplexity;

import java.util.Arrays;

public class TapeEquilibrium3 {

	public int solution(int[] A){
			
		int sum1 = 0, sub, min = Integer.MAX_VALUE;
		int sum2 = Arrays.stream(A).sum();
				
		for(int i=0; i < A.length; i++){
		  
		  sum1 += A[i];
		  sum2 -= A[i];
		  
		  sub = Math.abs(sum1 - sum2);
			
		  if(sub < min){
			  min = sub;
		  }
		}
		return min;
	}
	
	
	public static void main(String[] args) {
		
		int[] A = {3, 1, 2, 4, 3};
		int min = new TapeEquilibrium3().solution(A);
	    System.out.println(min);

	}


}
