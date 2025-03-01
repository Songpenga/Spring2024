package level_0;

public class Solution9_2 {
	   public int solution(int num1, int num2) {
	        boolean val = (0<=num1 && num1<=10000 && 0<=num2 && num2 <=10000);
	        int answer = 0;

	        if(val){
	            answer=(num1==num2)? 1: -1;
	        }
	        return answer;
	    }
}



