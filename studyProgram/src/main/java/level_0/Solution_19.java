package level_0;

import java.util.Arrays;

//짝수의 합
public class Solution_19 {
	public static void main(String[] args) {
		int i = 0;
		i = solution(10);
	}
    public static int solution(int n) {
        int answer = 0;
        
        for(int i = 0; i <= n; i++) {
        	System.out.println("i : " + i);
        	if(i%2 == 0){
        		answer += i;
        		System.out.println(i);
        		System.out.println(answer);
        	}
        }
        
        return answer;
    }
    
}




