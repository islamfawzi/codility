package com.TimeComplexity;

// minimal diffrence between 2 arrays sums

public class TapeEquilibrium {

	public int solution(int[] A){
	
	  if(A.length == 0){
		 return 0;
      }
	  
	  int P = 1, min = 0, sub = 0, sum1 = 0, sum2 = 0, i = 0, j = P;
	
	  while(P < A.length){
		  sum1 = 0; sum2 = 0; i = 0;
		  j = P;
		  
		  while(i < P){
			  sum1 += A[i];
			  i++;
		  }
		  
		  while(j < A.length){
			  sum2 += A[j];
			  j++;
		  }
		  
		  sub = Math.abs(sum1 - sum2);
		 
		  if(sub < min || min == 0){
			  min = sub;
		  }
	      P++;
	  }
	  
	  return min;
	}
	
	
	public static void main(String[] args) {
		
	   int[] A = {3, 1, 2, 4, 3};
	   int min = new TapeEquilibrium().solution(A);
       System.out.println(min);
	}

}
