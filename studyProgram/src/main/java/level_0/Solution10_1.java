package level_0;

import java.time.LocalDate;
import java.util.Arrays;

public class Solution10_1 {
    
    public int solution(int age) {
        LocalDate today = LocalDate.now();
        return today.getYear() - age + 1;
    } 
}



