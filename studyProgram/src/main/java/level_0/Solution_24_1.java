package level_0;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution_24_1 {
    public int[] solution1(int[] num_list) { //미쳤다....
        int[] answer = new int[2];

        for(int i = 0; i < num_list.length; i++)
            answer[num_list[i] % 2]++;

        return answer;
    }

    public int[] solution2(int[] numList) {
        return IntStream.of((int) Arrays.stream(numList).filter(i -> i % 2 == 0).count(), (int) Arrays.stream(numList).filter(i -> i % 2 == 1).count()).toArray();
    }

    public int[] solution3(int[] num_list) {
        int[] answer = new int[2];

        for(int i = 0 ; i < num_list.length ; i++){
            if(num_list[i]%2==0){
                answer[0]++;
            }else{
                answer[1]++;
            }
        }

        return answer;
    }
    
    public int[] solution4(int[] num_list) {

        int even = 0;
        int odd = 0;

        for(int num : num_list){
            if(num %2 == 0){
                even++;
            }else{
                odd++;
            }

        }

        return new int[]{even, odd}; //이런 방법도
    }    
}



