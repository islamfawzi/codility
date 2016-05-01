package com.TimeComplexity;

public class FrogJmp2 {

public int solution(int X, int Y, int D){
  		
    	int count = 0;
    	if(X < Y){
	    	
	    	count = ((Y - X) / D) + 1;
	    	
    	}
    	
		return count;
	}

	public static void main(String[] args) {
        
	 
		System.out.println(new FrogJmp2().solution(10, 85, 30));
	}

}
