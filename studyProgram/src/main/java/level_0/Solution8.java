package level_0;

import java.util.Arrays;
import java.util.Scanner;

public class Solution8 {
    
	
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        String test = "";
        
        for(int i = 0; i<a.length(); i++){
            char c = a.charAt(i);
            // charAt: 문자열(String)에서 특정 인덱스에 위치하는 유니코드 단일문자를 반환한다.
            
            if(Character.isUpperCase(c)){
            	test += Character.toLowerCase(c);            	
            }else {
            	test += Character.toUpperCase(c);
            }
        }
        System.out.println(test);        
        
        
        
        //[참고]
        
        
    }

    
}



