package level_0;

import java.util.Arrays;

//분수의 덧셈
public class Solution_17_Demo {
	
	public static void main(String[] args) {
		int answer = 0;
		answer = solution(1,2,3,4);
		System.out.println(answer);
	}
    
    public static int solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = {};
        
        int numer11 = 2;
        int denom11 = 3;
        int numer22 = 5;
        int denom22 = 6;
        
        int newnumber = numer11 * numer22; //분모
        int newdenom = (denom11 * numer22) + (numer11+denom22); //분자       
        
        		
        int gcdVal = gcd(newnumber, newdenom); // 기약분수        
        
        newnumber /= gcdVal;
        newdenom /=  gcdVal;
        
        System.out.println(newnumber + ", " + newdenom );

        if(denom22 != gcdVal) {
        	denom22 *= gcdVal; 
        	numer22 *= gcdVal;
        }
        
        System.out.println(denom22 + ", " + numer22);
        
        return gcdVal;
    }
	
	public static int gcd(int a, int b) {
		if(b == 0) return a;
		return gcd(b, a%b);
	}
    
}




