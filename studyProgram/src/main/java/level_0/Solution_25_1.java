package level_0;

import java.util.Arrays;

public class Solution_25_1 {
    public int solution1(int n) {
        return (n + 6) / 7;
    }
    
    public int solution2(int n) {
        int answer = (n%7==0) ? n/7 : n/7 + 1;

        return answer;
    }    
}



