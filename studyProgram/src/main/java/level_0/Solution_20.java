package level_0;

import java.util.Arrays;

public class Solution_20 {
    
    public static void main(String[] args) {
    	String message = "happy birthday!";
    	
    	System.out.println(message.length());
    }

    public int solution(String message) {
    	
        int answer = message.length() * 2;
        
        return answer;
    }
    
}



