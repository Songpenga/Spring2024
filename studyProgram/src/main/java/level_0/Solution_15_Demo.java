package level_0;

import java.util.Arrays;

public class Solution_15_Demo {
	
    public static void main(String[] args) {
    	int[] arr = {9, -1, 0, 7, 4, -11};
    	
        Arrays.sort(arr);
        
        for(int num : arr) {
        	System.out.println(num);
        }
        
        int length = (arr.length)%2;
        int mod = (arr.length)/2;
        System.out.println("=================================");
        
        
        if(length == 0) {
        	System.out.println(arr[mod]);
        }else if(length == 1){
        	System.out.println(arr[mod]);
        }
        
    }
    
	/*
	 * public int solution(int[] array) { int[] arr = {9, -1, 0};
	 * 
	 * Arrays.sort(arr);
	 * 
	 * 
	 * return answer; }
	 */
    
}



