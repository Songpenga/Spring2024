package level_0;

import java.util.Arrays;

//분수의 덧셈
public class Solution_17 {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {

        int newnumber = numer1 * denom2 + numer2 * denom1;
        int newdenom = denom1 * denom2;

        int gcdVal = gcd(newnumber, newdenom);        

        newnumber /= gcdVal;
        newdenom /=  gcdVal;        

        return new int[]{newnumber, newdenom};
    }

    public int gcd(int a, int b) {
        if(b == 0) return a;
        return gcd(b, a%b);
    } 
    
}




