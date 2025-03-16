package level_0;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution12_2 {    
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        
        //1
        String answer1 = a.concat(b);
        System.out.println(answer1);
        
        //2
        System.out.println(String.join("", a, b));
        
        //3
        String answer3 = a+b;
        answer3 = answer3.replace(" ", "");
        System.out.println(answer3);
        
        //4
        System.out.print(a.trim() + b.trim());  
        
        //5
        System.out.println((a+b).replace(" ", ""));
    }  
}



