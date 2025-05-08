package level_0;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Solution_26 {
    public int[] solution1(int n, int[] numList) {
        return Arrays.stream(numList).filter(value -> value % n == 0).toArray();
    }
    
    public int[] solution2(int n, int[] numlist) {
        int count = 0;
        for(int i : numlist){
            if(i%n==0){
                count++;
            }
        }

        int[] answer = new int[count];
        int idx = 0;
        for(int i : numlist){
            if(i%n==0){
                answer[idx]=i;
                idx++;
            }
        }
        return answer;
    }    
    
    public int[] solution3(int n, int[] numlist) {
        List<Integer> answer = new ArrayList<>();
        for(int num : numlist){
            if(num % n == 0){
                answer.add(num);
            }
        }
        return answer.stream().mapToInt(x -> x).toArray();
    }    
}



