package level_0;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Solution_27 {
    public static void main(String[] args) {
    	int answer = (int) ((int) 2*Math.pow(2, 10));
    	double answer2 = Math.pow(4, 10);
    	
    	System.out.println(answer);
    	System.out.println(answer2);
    }	
    public int solution(int n, int t) {
        int answer = (int) ((int) n*Math.pow(2, t));
        return answer;
    }
}



