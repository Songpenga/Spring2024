package level_0;

import java.util.Arrays;
import java.util.ArrayList;

public class Solution_26_1 {
    
    public int[] solution(int n, int[] numlist) {
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

        return answer;
    }
      
}



