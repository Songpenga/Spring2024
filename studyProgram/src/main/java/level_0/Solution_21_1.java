package level_0;

import java.util.Arrays;
import java.util.stream.IntStream;

import java.util.List;
import java.util.ArrayList;

public class Solution_21_1 {
    
    public int[] solution1(int n) {
        return IntStream.rangeClosed(0, n).filter(value -> value % 2 == 1).toArray();
    }
    
    public int[] solution2(int n) {
        List<Integer> answer = new ArrayList<>();
        for(int i=1; i<=n; i++){
            if(i % 2 == 1){
                answer.add(i);
            }
        }
        return answer.stream().mapToInt(x -> x).toArray();
    }    
    
}



