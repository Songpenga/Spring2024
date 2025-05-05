package level_0;

import java.util.Arrays;

public class Solution_25 {
    
    public static void main(String[] args) {
        int answer = 0;
        int n = 20;
        
        if(n < 7) {
        	answer = 1;
        }else {
        	answer = n/7;
        }
        System.out.println(answer);
    }

    public int solution(int n) {
        int answer = 0;
        n = 20;
        
        if(n < 7) {
        	answer = 1;
        }else {
        	answer = n/7;
        }
        return answer;
    }
}



