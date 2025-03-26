package level_0;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution_14_1 {
    
    public int[] solution1(int[] numbers) {
    	//1
        int[] answer = {};
        answer = new int[numbers.length];
        for(int i=0; i<answer.length; i++){
            answer[i] = numbers[i]*2;
        }
        return answer;
    }
        
    public ArrayList solution2(int[] numbers) {
        ArrayList<Integer> answer = new ArrayList<>();

        for(int num : numbers){
            answer.add(num*2);
        }

        return answer;
    }        
    
}



