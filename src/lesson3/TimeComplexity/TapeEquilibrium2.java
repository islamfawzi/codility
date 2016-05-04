package lesson3.TimeComplexity;

import java.util.Arrays;
import java.util.stream.IntStream;

public class TapeEquilibrium2 {

	public int solution(int[] A){
	
		if(A.length == 0){
			return 0;
	    }
		
		int P = 1, sum1 = 0, sum2=0, sub = 0, min = 0;
			
		while(P < A.length){
		  
		  int[] A1 = Arrays.copyOfRange(A, 0, P);
		  int[] A2 = Arrays.copyOfRange(A, P, A.length);
		  
		  //sum1 = IntStream.of(A1).sum();
		  //sum2 = IntStream.of(A2).sum();
		  sum1 = Arrays.stream(A1).sum();
		  sum2 = Arrays.stream(A2).sum();
		  
		  sub = Math.abs(sum1 - sum2);
			
		  if(sub < min || min == 0){
			  min = sub;
		  }
	      P++;
		
		}
		return min;
	}
	
	
	public static void main(String[] args) {
		
		int[] A = {3, 1, 2, 4, 3, 5};
		int min = new TapeEquilibrium2().solution(A);
	    System.out.println(min);

	}

}
