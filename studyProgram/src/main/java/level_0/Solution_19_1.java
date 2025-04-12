package level_0;

import java.util.Arrays;
import java.util.stream.IntStream;

//짝수의 합
public class Solution_19_1 {
    public static int solution1(int n) {
        int answer = 0;

        for(int i=2; i<=n; i+=2){
            answer+=i;
        }

        return answer;
    }   
    
    public int solution2(int n) {
        return IntStream.rangeClosed(0, n)
            .filter(e -> e % 2 == 0)
            .sum();
    } 
    
    public int solution3(int n) {
        int answer = 0;

        while(n>0){
            if(n%2==0) answer+=n;
            n--;
        }
        return answer;
    }    
}




