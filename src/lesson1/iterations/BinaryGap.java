package lesson1.iterations;

public class BinaryGap {

	public int solution(int N){
		
		String binary = Integer.toBinaryString(N);
		
		int count = 0;
		int occur = 0;
		for(int i=0; i<binary.length(); i++){
			
			if(binary.charAt(i) == '0'){
				count++;
		  	}else{
		  		if(count > occur){
		  		  occur = count;
		  		}
		  		count = 0;
		  	}
			
		}
		
		return occur;
	}
	
	public static void main(String[] args) {
		
      BinaryGap gap = new BinaryGap();
      System.out.println(gap.solution(9));
      
	}

}
