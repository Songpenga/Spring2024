package level_0;

import java.util.Arrays;

public class Solution6 {
    
	
    public static void main(String[] args) {
    	String str = "string";
    	int n = 5;
    	
    	//[나의 풀이]
    	for(int i = 0; i < n; i++) {
    		System.out.print(str);
    		
    		//[참고]
    		
    	}

		//[참고]
    	StringBuilder sb = new StringBuilder();
    	
    	for(int i = 0; i < n; i++) {
    		sb.append(str);
    		
    	}

        if(str.length() >= 1 && str.length() <= 10 && n >= 1 && n <= 5) {
            for(int i = 0; i < n; i++){
                System.out.print(str);
            }
        }
    	
    	//[참고]
    	System.out.print(str.repeat(n));
    	
    	
    }

    
}



