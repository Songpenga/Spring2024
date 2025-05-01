package level_0;

import java.util.Arrays;

public class Solution_24 {
    
    public static void main(String[] args) {
    	
    }

    public int[] solution(int[] num_list) {
        int[] answer = {1,2,3,4,5};
        int odd = 0;
        int edd = 0;
        
        for(int i = 0; i < answer.length; i++) {
        	if(answer[i]%2 == 1) {
        		odd++;
        	}else {
        		edd++;
        	}
        }
        return answer;
        // return new int[]{even, odd};
    }
    
}



