package lesson3.TimeComplexity;

public class FrogJmp2 {

    public int solution(int X, int Y, int D){
  		
    	int count = 0;
    	if(X < Y){
	    	
    		count = ((Y - X) / D);
    		if((Y - X) % D != 0){
    			count += 1;
    		}
	    	
    	}
    	
		return count;
	}

	public static void main(String[] args) {
        
	 
		System.out.println(new FrogJmp2().solution(10, 80, 30));
	}

}
