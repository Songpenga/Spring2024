package level_0;

import java.util.Arrays;
import java.util.Scanner;

public class Solution8_1 {
    
	
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        String test = "";
        
        //[참고]
        for(int i = 0; i<a.length(); i++){
            char index = a.charAt(i);
            
            if(index >= 65 && index <= 90) {
            	test += String.valueOf(index).toLowerCase();
            } else {
            	test += String.valueOf(index).toUpperCase();
            }
        }
        System.out.println(test);        
        
    }

    
}



