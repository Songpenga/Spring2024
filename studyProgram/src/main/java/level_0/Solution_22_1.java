package level_0;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution_22_1 {
    
    public int[] solution1(int[] numbers, int num1, int num2) {
        return Arrays.copyOfRange(numbers, num1, num2 + 1);
    }
	
    public int[] solution1_2(int[] numbers, int num1, int num2) {
        return IntStream.rangeClosed(num1, num2).map(i -> numbers[i]).toArray();
    }
    
    public int[] solution1_3(int[] numbers, int num1, int num2) {

        int[] answer = Arrays.stream(numbers, num1, num2+1).toArray();
        return answer;
    }
    
    public int[] solution2(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2 - num1 + 1];

        for (int i = num1; i <= num2; i++) {
            answer[i -num1] = numbers[i];
        }

        return answer;
    }    
}



