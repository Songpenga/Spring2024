package level_0;

import java.util.Arrays;

public class Solution_21 {
    
    public static void main(String[] args) {
    	int n=10;
        int[] answer = new int[(n+1)/2];
        int index = 0;

        for(int i = 0; i<=n; i++) {
            if(i%2 == 1) {
                answer[index] = i;
                index++;
            }
        }      

    }
    
}



