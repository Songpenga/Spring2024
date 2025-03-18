package level_0;

import java.util.Arrays;
import java.util.Scanner;

public class Solution13_1 {
    
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
    	
       //1 
        for (char ch : a.toCharArray())
            System.out.println(ch);
        
        //2
        for(String s : a.split("")){
            System.out.println(s);
        }
        
        //3
        Arrays.stream(a.split("")).forEach(System.out::println);
        
    }
    

    
}



