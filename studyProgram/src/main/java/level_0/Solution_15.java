package level_0;

import java.util.Arrays;

public class Solution_15 {
	
    public int solution(int[] array) {

        Arrays.sort(array);

        int mod = (array.length)/2;        

        return array[mod];
    }
    
    public int solution2(int[] array) {
        Arrays.sort(array);

        int answer = array[array.length/2];

        return answer;
    }    
    
    public int solution3(int[] array) {
        Arrays.sort(array);

        return array[array.length / 2];
    }    
    
}



