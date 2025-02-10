package level_0;

import java.util.Arrays;
import java.util.Scanner;

public class Solution8_2 {
    
	
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        //[참고]
        for(int i=0; i<a.length(); i++) {
            char c = a.charAt(i);
            if(Character.isUpperCase(c)) {
                System.out.print((char)(c+32));
            }
            else {
                System.out.print((char)(c-32));
            }
        }     
        
        
    }

    
}



