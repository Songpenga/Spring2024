package level_0;

import java.util.Arrays;

public class Solution3 {
    
	
    public static void main(String[] args) {
    	
    	Solution3 sol = new Solution3();
    	int[] num_list1 = {3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1};
    	int[] num_list2 = {2, 3, 4, 5};
    	
    	sol.solution(num_list1);
    	sol.solution(num_list2);
    	
    	System.out.println("test");
    	
    }
    
    public int solution(int[] num_list) {
        int answer = 0;
        
        if(num_list.length >= 11) { //이 부분을 놓침...
        	for(int i = 0; i < num_list.length; i++) {
        		answer += num_list[i];
        	}
        }else {
        	answer = 1;
        	
        	for(int i = 0; i < num_list.length; i++) {
        		answer = answer * num_list[i];
        	}        	
        }
        
        System.out.println(answer);        	
        	
        return answer;
    
    }
    
  //[참조]
    public int solution2(int[] num_list) {
        int answer = (num_list.length < 11 ? 1 : 0);

        for(int i=0; i<num_list.length; i++){

            if(num_list.length < 11) {
                answer *= num_list[i];
            }else{
                answer += num_list[i];
            }

        }

        return answer;
    }
    
    public int solution3(int[] num_list) {
        if (num_list.length > 10)
            return Arrays.stream(num_list).reduce(0, Integer::sum);
        else
            return Arrays.stream(num_list).reduce(1, (x,y) -> x * y);
    }    
    
    public int solution4(int[] num_list) {
        int answer = 0;

        if (num_list.length >= 11) {
            for (int x : num_list) {
                answer += x;
            }
        } else {
            answer = 1;
            for (int x : num_list) {
                answer *= x;
            }
        }
        return answer;
    }    
    
}



