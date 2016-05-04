package lesson2.arrays;

import java.util.Arrays;

public class CyclicRotation {

	public int[] solution(int[] A, int K){
		
		
		int N = A.length;
		
		if(N == 0){
			return A;
		}
		
		for(int i=0; i<K; i++){
			
			int[] temp = new int[N];
			
			temp[0] = A[N-1];
			
			for(int j=0; j<N-1; j++){
				temp[j+1] = A[j];
			}
			
			A = temp;
		}
		
		return A;
	}
	
	public static void main(String[] args) {
		
		CyclicRotation rotation = new CyclicRotation();
		int[] A = {3, 8, 9, 7, 6};
		A = rotation.solution(A, 3);
		
		// Empty Array
		int[] B = {};
		
		
		System.out.println(Arrays.toString(A));

	}

}
