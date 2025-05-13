package level_0;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Solution_27_1 {
    public int solution1(int n, int t) {
        int answer = 1;

        answer = n * (int)Math.pow(2, t);

        return answer;
    }
    
    public int solution2(int n, int t) {
        int answer = n;
        for(int i=1; i<=t; i++){
            answer *= 2;
        }
        return answer;
    }    
}



