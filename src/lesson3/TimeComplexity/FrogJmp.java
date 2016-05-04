package lesson3.TimeComplexity;

public class FrogJmp {

    public int solution(int X, int Y, int D){
  		
    	int count = 0;
    	if(X < Y){
	    	int Jmp = X;
	    	
	    	while(Jmp < Y){
	    		Jmp += D;
	    		count++;
	    	}
    	}
    	
		return count;
	}

	public static void main(String[] args) {
        
	 
		System.out.println(new FrogJmp().solution(20, 85, 40));
	}
	
	

}
