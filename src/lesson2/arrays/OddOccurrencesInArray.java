package lesson2.arrays;

import java.util.HashMap;
import java.util.Map;

public class OddOccurrencesInArray {

	public int solution(int[] A){
		
		int unpair = 0;
		if(A.length != 0){
			Map<Integer, Integer> map = new HashMap<Integer, Integer>();
			
			for(int i = 0; i < A.length; i++){
			  for(int j = i+1; j < A.length; j++){
				  if(A[i] == A[j] && !map.containsValue(i)){
				    	map.put(i, j);
				    	break;
				  }
			  }			
			}
			
			for(int i=0; i < A.length; i++){
				if(!map.containsValue(i) && !map.containsKey(i)){
					unpair = A[i];
				}
			}
		}else{
			unpair = 0;
		}
			
		return unpair;
	}
	
	public static void main(String[] args) {
		
		OddOccurrencesInArray solution = new OddOccurrencesInArray();
		
		int[] A = {9, 3, 9, 3, 9, 7, 9};
		System.out.println(solution.solution(A));

	}

}
