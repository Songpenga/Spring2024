package level_0;

import java.util.Arrays;
import java.util.ArrayList;

public class Solution_26_Demo {
    
    public static void main(String[] args) {
    	
    	int n = 3;
    	int[] numlist = {4, 5, 6, 7, 8, 9, 10, 11, 12};
        ArrayList<Integer> answerIndex = new ArrayList<Integer>();
        
        for( int i : numlist){
            if(i%n == 0){
            	answerIndex.add(i);
            }
        }
        
        int[] answer = new int[answerIndex.size()]; 
        		
        for(int j = 0; j < answer.length; j++) {
        	answer[j] = answerIndex.get(j);
        }
    }
      
}



