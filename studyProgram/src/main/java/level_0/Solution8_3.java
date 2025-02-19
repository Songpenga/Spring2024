package level_0;

import java.util.Arrays;
import java.util.Scanner;

public class Solution8_3 {
    
	
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        //[참고]
        StringBuilder sb = new StringBuilder();
        for(char k : a.toCharArray()){
            if(Character.isLowerCase(k)){
                sb.append(Character.toUpperCase(k));
            }
            else{
                sb.append(Character.toLowerCase(k));
            }
        }
        System.out.println(sb);        
        
        
    }

    
}



