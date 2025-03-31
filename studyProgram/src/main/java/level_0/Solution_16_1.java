package level_0;

//배열의 평균값
public class Solution_16_1 {
    
    class Solution {
        public double solution(int[] numbers) {
            double answer = 0;

            for(int i : numbers) {
                answer += i;
            }

            answer = answer/numbers.length;

            return answer;
        }
    }
    
}




