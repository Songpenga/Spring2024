package level_0;

import java.util.Arrays;

//배열의 평균값
public class Solution_16 {
    
    class Solution {
        public double solution(int[] numbers) {
            return Arrays.stream(numbers).average().orElse(0);
        }
    }
    
    class Solution1 {
        public double solution(int[] numbers) {
            return Arrays.stream(numbers).average().getAsDouble();
        }
    }
    
    public double solution2(int[] numbers) {
        double answer = 0;

        int sum = 0;
        for(int i: numbers){
            sum+=i;
        }
        answer = sum/(double)numbers.length;
        return answer;
    }    
    
}




